package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;
import com.ProjectActivity.importerSite.Entity.Technology;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyCountryRepository extends JpaRepository<Country_Technology_Unit, Long> {
	List<Country_Technology_Unit> findByCountryAndYear(Country country, short year);

	List<Country_Technology_Unit> findByYear(short year);

	List<Country_Technology_Unit> findByTechnologyAndYear(Technology technology, short year);

	List<Country_Technology_Unit> findByTechnologyAndCountry(Technology technology, Country country);
}
