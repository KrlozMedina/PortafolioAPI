package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "projects")
@Entity(name = "Projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String title;
    private String descripcion;
    private String description;
    @Enumerated(EnumType.STRING)
    private App app;
    private String deploy;
    private String repository;
    private String image;
    private boolean active;
    @Enumerated(EnumType.STRING)
    private Front front;
    @Enumerated(EnumType.STRING)
    private Style style;
    @Enumerated(EnumType.STRING)
    private Back back;
    @Enumerated(EnumType.STRING)
    private DB db;
    @Enumerated(EnumType.STRING)
    private Cloud cloud;
}
