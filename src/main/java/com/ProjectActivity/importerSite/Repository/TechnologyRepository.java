package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.Technology;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {
	Technology getById(Long id);

	List<Technology> findAll();
}
