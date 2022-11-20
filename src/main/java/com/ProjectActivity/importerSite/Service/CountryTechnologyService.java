package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.ImportDto;
import com.ProjectActivity.importerSite.Dto.IndexCountryTechnologyDto;
import com.ProjectActivity.importerSite.Dto.TechnologyByCountryDto;
import java.util.Collection;
import java.util.List;

public interface CountryTechnologyService {
	List<ImportDto> productList(long id, short year);

	List<IndexCountryTechnologyDto> technologyByCountry(long id);

	List<IndexCountryTechnologyDto> technologyByCountryAndYear(long countryId, short year);

	//А сами вот и придумывайте названия
	List<IndexCountryTechnologyDto> technologyByTechnologyAndCountry(
		long technologyId,
		long countryId
	);

	List<IndexCountryTechnologyDto> findByTechnologyAndYear(long technologyId, short year);
}
