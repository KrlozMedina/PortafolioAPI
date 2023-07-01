package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.xml.crypto.Data;

public record DataRegisterProject(
        @NotBlank String titulo,
        @NotBlank String title,
        @NotBlank String descripcion,
        @NotBlank String description,
        @NotNull App app,
        @NotBlank String deploy,
        @NotBlank String repository,
        @NotBlank String image,
        Front front,
        Style style,
        Back back,
        DB db,
        Cloud cloud
) {
}
