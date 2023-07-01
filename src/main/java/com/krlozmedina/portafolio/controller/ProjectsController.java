package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.projects.*;
import com.krlozmedina.portafolio.utils.App;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

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

//    @PostMapping
//    public ResponseEntity<DatosRespuestaMedico> registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico, UriComponentsBuilder uriComponentsBuilder) {
//        System.out.println("El request es satisfactorio");
//        Medico medico = medicoRepository.save(new Medico(datosRegistroMedico));
//
//        URI url = uriComponentsBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
//        return ResponseEntity.created(url).body(createRespuestaMedico(medico));
//    }

    @PostMapping
    public ResponseEntity<ListProjectDTO> registerProject(@RequestBody @Valid DataRegisterProject dataRegisterProject, UriComponentsBuilder uriComponentsBuilder) {
        Project project = projectRepository.save(new Project(dataRegisterProject));
        URI url = uriComponentsBuilder.path("/projects/{id}").buildAndExpand(project.getId()).toUri();
        return ResponseEntity.created(url).body(new ListProjectDTO(project));
    }

    private void countVisitors() {
        System.out.println(++contador + " visitas realizadas para revisar los proyectos");
    }
}
