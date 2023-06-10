package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.projects.*;
import com.krlozmedina.portafolio.utils.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projects")
public class ProjectsController {
    static int contador = 0;

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<ListProjectDTO>> listProjects(Pageable pageable) {
        countVisitors();
        return ResponseEntity.ok(projectRepository.findByActiveTrue(pageable).map(ListProjectDTO::new));
    }

    @GetMapping("{app}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<ListProjectDTO>> listProjectsApp(Pageable pag, @PathVariable App app) {
        countVisitors();
        return ResponseEntity.ok(projectRepository.findAllByAppAndActiveTrue(pag, app).map(ListProjectDTO::new));
    }

    private void countVisitors() {
        System.out.println(++contador + " visitas realizadas para revisar los proyectos");
    }
}
