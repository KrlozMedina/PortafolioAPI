package com.krlozmedina.portafolio.domain.projects;

public record ThumbnailsmediumDTO(String url) {
    public ThumbnailsmediumDTO(Project project) {
        this(project.getImage());
    }
}
