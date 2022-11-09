package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.Chin;
import com.ProjectActivity.importerSite.Entity.RawImportITS;
import com.ProjectActivity.importerSite.Entity.RawTechnologyITS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface RawTeсhnologyITSRepository extends JpaRepository<RawTechnologyITS, Long> {

    @Procedure("technology_data")
    List<RawTechnologyITS> technology_data(int countryId, int year);
}
