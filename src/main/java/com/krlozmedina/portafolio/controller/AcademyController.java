package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.academies.AcademyDTO;
import com.krlozmedina.portafolio.domain.academies.AcademyRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academies")
public class AcademyController {
    @Autowired
    AcademyRepository academyRepository;

    @GetMapping
    public ResponseEntity<Page<AcademyDTO>> listAcademies(@PageableDefault(size = 10) Pageable pag) {
        return ResponseEntity.ok(academyRepository.findAll(pag).map(AcademyDTO::new));
    }
}
