package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.*;

public record StackDTO(Front front, Style style, Back back, DB db, Cloud cloud) {
    public StackDTO(Project project) {
        this(
                project.getFront(),
                project.getStyle(),
                project.getBack(),
                project.getDb(),
                project.getCloud()
        );
    }
}
