package com.krlozmedina.portafolio.domain.certificates;

import com.krlozmedina.portafolio.utils.Academy;
import com.krlozmedina.portafolio.utils.Category;
import com.krlozmedina.portafolio.utils.Type;

import java.util.Date;

public record CertificateDTO(
        Long id,
        Academy academy,
        Type type,
        String name,
        String linkCloud,
        String linkAcademy,
        Category category,
        Date dateFinal
) {
    public CertificateDTO(Certificate certificate) {
        this(
                certificate.getId(),
                certificate.getAcademy(),
                certificate.getType(),
                certificate.getName(),
                certificate.getLinkcloud(),
                certificate.getLinkacademy(),
                certificate.getCategory(),
                certificate.getDatefinal()
        );
    }
}
