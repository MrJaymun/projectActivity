package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.ImportDto;
import com.ProjectActivity.importerSite.Dto.TechnologyCountryDto;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;

import java.util.List;

public interface CountryTechnologyService {
    List<ImportDto> productList(long id, short year);


}
