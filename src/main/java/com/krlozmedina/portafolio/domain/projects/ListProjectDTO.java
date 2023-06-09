package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.App;

public record ListProjectDTO(
        Long id,
        EnglishProjectDTO english,
        SpanishProjectDTO spanish,
        App app,
        String linkDeploy,
        String linkCode,
        ThumbnailDTO thumbnails,
        StackDTO stack

) {
    public ListProjectDTO(Project project) {
        this(
                project.getId(),
                new EnglishProjectDTO(project),
                new SpanishProjectDTO(project),
                project.getApp(),
                project.getDeploy(),
                project.getRepository(),
                new ThumbnailDTO(project),
                new StackDTO(project)
        );
    }
}
