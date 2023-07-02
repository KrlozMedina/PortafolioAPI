package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.projects.*;
import com.krlozmedina.portafolio.utils.App;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("projects")
public class ProjectsController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<ListProjectDTO>> listProjects(Pageable pageable, @RequestParam(required = false, defaultValue = "true") boolean active) {
        if (active) {
            return ResponseEntity.ok(projectRepository.findByActiveTrue(pageable).map(ListProjectDTO::new));
        } else {
            return ResponseEntity.ok(projectRepository.findByActiveFalse(pageable).map(ListProjectDTO::new));
        }
    }

    @GetMapping("{app}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<ListProjectDTO>> listProjectsApp(Pageable pag, @PathVariable App app, @RequestParam(required = false, defaultValue = "true") boolean active) {
        if (active) {
            return ResponseEntity.ok(projectRepository.findAllByAppAndActiveTrue(pag, app).map(ListProjectDTO::new));
        } else {
            return ResponseEntity.ok(projectRepository.findAllByAppAndActiveFalse(pag, app).map(ListProjectDTO::new));
        }
    }

    @PostMapping
    public ResponseEntity<ListProjectDTO> registerProject(@RequestBody @Valid DataRegisterProject dataRegisterProject, UriComponentsBuilder uriComponentsBuilder) {
        Project project = projectRepository.save(new Project(dataRegisterProject));
        URI url = uriComponentsBuilder.path("/projects/{id}").buildAndExpand(project.getId()).toUri();
        return ResponseEntity.created(url).body(new ListProjectDTO(project));
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProject(@RequestBody @Valid DataUpdateProject dataUpdateProject) {
        Project project = projectRepository.getReferenceById(dataUpdateProject.id());
        project.updateData(dataUpdateProject);
        return ResponseEntity.ok(new ListProjectDTO(project));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public  ResponseEntity deleteProject(@PathVariable Long id) {
        Project project = projectRepository.getReferenceById(id);
//        projectRepository.delete(project);
        project.inactiveProject();
        return  ResponseEntity.noContent().build();
    }
}
