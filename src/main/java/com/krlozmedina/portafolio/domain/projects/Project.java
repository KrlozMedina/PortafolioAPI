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

    public Project(DataRegisterProject dataRegisterProject){
        this.titulo = dataRegisterProject.titulo();
        this.title = dataRegisterProject.title();
        this.descripcion = dataRegisterProject.descripcion();
        this.description = dataRegisterProject.description();
        this.app = dataRegisterProject.app();
        this.deploy = dataRegisterProject.deploy();
        this.repository = dataRegisterProject.repository();
        this.image = dataRegisterProject.image();
        this.active = true;
        this.front = dataRegisterProject.front();
        this.style = dataRegisterProject.style();
        this.back = dataRegisterProject.back();
        this.db = dataRegisterProject.db();
        this.cloud = dataRegisterProject.cloud();
    }
}
