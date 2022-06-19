package com.ProjectActivity.importerSite.Repository;


import com.ProjectActivity.importerSite.Entity.Code_hs96;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Import_Export_Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ImportExportDataRepository extends JpaRepository<Import_Export_Unit, Long> {

    List<Import_Export_Unit>  findByImporterAndYear(Country importer, short year);
}
