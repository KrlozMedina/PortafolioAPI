package com.krlozmedina.portafolio.domain.projects;

public record SpanishProjectDTO(String title, String description) {
    public SpanishProjectDTO(Project project) {
        this(project.getTitulo(), project.getDescripcion());
    }
}
