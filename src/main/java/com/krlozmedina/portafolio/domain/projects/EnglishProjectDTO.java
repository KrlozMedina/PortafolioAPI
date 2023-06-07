package com.krlozmedina.portafolio.domain.projects;

public record EnglishProjectDTO(String title, String description) {
    EnglishProjectDTO(Project project) {
        this(project.getTitle(), project.getDescription());
    }
}
