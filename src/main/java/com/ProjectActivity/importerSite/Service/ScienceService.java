package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.CountryDto;

import java.io.IOException;
import java.util.List;

public interface ScienceService {
	String h1(int countryId, int year);

	String h2(int countryId, int year, int technology);

	void doMagic() throws IOException;
}
