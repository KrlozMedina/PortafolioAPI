package com.krlozmedina.portafolio.domain.academies;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "academies")
@Entity(name = "Academies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Academy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String link;
    private Date foundation;
    private String type;
    private String industry;
}
