package com.krlozmedina.portafolio.domain.projects;

import com.krlozmedina.portafolio.utils.App;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Page<Project> findByActiveTrue(Pageable pageable);

    Project getReferenceByApp(App app);

    Page<Project> findAllByAppAndActiveTrue(Pageable pageable, App app);

}
