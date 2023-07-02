package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataUpdateProject(
        @NotNull Long id,
        String titulo,
        String title,
        String descripcion,
        String description,
        App app,
        String deploy,
        String repository,
        String image,
        Front front,
        Style style,
        Back back,
        DB db,
        Cloud cloud
) {
}
