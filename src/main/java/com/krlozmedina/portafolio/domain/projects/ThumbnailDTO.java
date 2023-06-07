package com.krlozmedina.portafolio.domain.projects;

public record ThumbnailDTO(ThumbnailsmediumDTO medium) {
    public ThumbnailDTO(Project project) {
        this(new ThumbnailsmediumDTO(project));
    }
}
