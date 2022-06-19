package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

    Technology getById(Long id);
}
