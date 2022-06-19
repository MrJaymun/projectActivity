package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.IPADDto;

import java.util.List;

public interface IPADService {
    List<IPADDto> countriesList(int year);
}
