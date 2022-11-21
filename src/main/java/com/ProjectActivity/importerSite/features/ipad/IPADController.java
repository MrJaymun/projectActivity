package com.ProjectActivity.importerSite.features.ipad;

import com.ProjectActivity.importerSite.Dto.IPADDto;
import com.ProjectActivity.importerSite.Service.Implementation.IPADServiceImpl;
import com.ProjectActivity.importerSite.Service.Implementation.YearServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(exposedHeaders = { "Access-Control-Allow-Origin" }, allowCredentials = "true", originPatterns = "*")
@RestController
@RequestMapping("api/v1/ipad")
public class IPADController {

	@Autowired
	IPADServiceImpl ipadService;

	@Autowired
	YearServiceImpl yearService;

	@GetMapping("indexes")
	public List<IPADDto> getIPADIndexes(@RequestParam("year") int year) {
		return ipadService.countriesList(year);
	}

	@GetMapping("years")
	public List<Integer> getIPADYears() {
		return yearService.yearsIPADList();
	}
}
