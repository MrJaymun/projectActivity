package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.RawImportITS;
import com.ProjectActivity.importerSite.Entity.RawTechnologyITS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface RawImportITSRepository extends JpaRepository<RawImportITS, Long> {

    @Procedure("import_data")
    List<RawImportITS> import_data(int countryId, int year);
}