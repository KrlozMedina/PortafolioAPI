package com.krlozmedina.portafolio.domain.academies;

import java.util.Date;

public record AcademyDTO(
        Long id,
        String name,
        String link,
        Date foundation,
        String type,
        String industry
) {
    public AcademyDTO(Academy academy) {
        this(
                academy.getId(),
                academy.getName(),
                academy.getLink(),
                academy.getFoundation(),
                academy.getType(),
                academy.getIndustry()
        );
    }
}
