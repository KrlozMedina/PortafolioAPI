package com.krlozmedina.portafolio.domain.projects;

public record ThumbnailDTO(String url) {
    public ThumbnailDTO(Project project) {
        this(project.getImage());
    }
}
