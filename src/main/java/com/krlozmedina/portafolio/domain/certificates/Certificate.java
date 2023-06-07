package com.krlozmedina.portafolio.domain.certificates;

import com.krlozmedina.portafolio.utils.Academyutil;
import com.krlozmedina.portafolio.utils.Category;
import com.krlozmedina.portafolio.utils.Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "certificates")
@Entity(name = "Certificates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Academyutil academyutil;
    @Enumerated(EnumType.STRING)
    private Type type;
    private String name;
    private String linkcloud;
    private String linkacademy;
    @Enumerated(EnumType.STRING)
    private Category category;
    private Date datefinal;
//    private List tag;
}
