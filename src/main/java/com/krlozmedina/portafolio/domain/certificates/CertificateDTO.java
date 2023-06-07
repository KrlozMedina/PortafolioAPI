package com.krlozmedina.portafolio.domain.certificates;

import com.krlozmedina.portafolio.utils.Academyutil;
import com.krlozmedina.portafolio.utils.Category;
import com.krlozmedina.portafolio.utils.Type;

import java.util.Date;

public record CertificateDTO(
        Long id,
        Academyutil academyutil,
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
                certificate.getAcademyutil(),
                certificate.getType(),
                certificate.getName(),
                certificate.getLinkcloud(),
                certificate.getLinkacademy(),
                certificate.getCategory(),
                certificate.getDatefinal()
        );
    }
}
