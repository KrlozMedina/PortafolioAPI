package com.krlozmedina.portafolio.domain.projects;

public record ListProjectDTO(
        Long id,
        EnglishProjectDTO english,
        SpanishProjectDTO spanish,
        String type,
        String link,
        String linkCode,
        ThumbnailDTO thumbnail

) {
    public ListProjectDTO(Project project) {
        this(
                project.getId(),
                new EnglishProjectDTO(project),
                new SpanishProjectDTO(project),
                project.getType(),
                project.getDeploy(),
                project.getRepository(),
                new ThumbnailDTO(project)
        );
    }
}
