package com.krlozmedina.portafolio.controller;

import com.krlozmedina.portafolio.domain.certificates.CertificateDTO;
import com.krlozmedina.portafolio.domain.certificates.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("certificates")
public class CertificatesController {
    @Autowired
    CertificateRepository certificateRepository;

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Page<CertificateDTO>> listCertificates(@PageableDefault(size =  10) Pageable pag) {
        return ResponseEntity.ok(certificateRepository.findAll(pag).map(CertificateDTO::new));
    }
}
