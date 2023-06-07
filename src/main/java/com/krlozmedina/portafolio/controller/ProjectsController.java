package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.projects.ListProjectDTO;
import com.krlozmedina.portafolio.domain.projects.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("projects")
public class ProjectsController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<ListProjectDTO>> listProjects(Pageable pageable) {
        return ResponseEntity.ok(projectRepository.findAll(pageable).map(ListProjectDTO::new));
    }
}
