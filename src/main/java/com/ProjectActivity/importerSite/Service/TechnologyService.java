package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.TechnologyDto;
import com.ProjectActivity.importerSite.Entity.Technology;

import java.util.List;

public interface TechnologyService {

    List<TechnologyDto> getTechnologies();
}
