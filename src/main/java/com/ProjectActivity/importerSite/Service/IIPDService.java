package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.IIPDDto;
import java.util.List;

public interface IIPDService {
	List<IIPDDto> countriesList(int year);
}
