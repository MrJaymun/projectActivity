package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.RawTechnologyITS;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface RawTeсhnologyITSRepository
	extends JpaRepository<RawTechnologyITS, Long> {
	@Procedure("technology_data")
	List<RawTechnologyITS> technology_data(int countryId, int year);
}
