package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.IntegerValue;
import com.ProjectActivity.importerSite.Entity.RawTechnologyITS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScienceRepository extends JpaRepository<IntegerValue, Long> {
	@Procedure("h1")
	List<IntegerValue> h1(int countryId, int year);

	@Procedure("h2")
	List<IntegerValue> h2(int countryId, int year, int technology);
}
