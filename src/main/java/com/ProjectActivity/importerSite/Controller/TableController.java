package com.ProjectActivity.importerSite.Controller;

import com.ProjectActivity.importerSite.Dto.*;
import com.ProjectActivity.importerSite.Service.Implementation.*;
import com.ProjectActivity.importerSite.Service.TechnologyService;
import com.ProjectActivity.importerSite.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin"}, allowCredentials = "true", originPatterns = "*")
@RestController
public class TableController {


   @Autowired
    CountryTechnologyServiceImpl countryTechnologyService;

   @Autowired
    CountryServiceImpl countryService;

   @Autowired
    YearServiceImpl yearService;

   @Autowired
    IIPDServiceImpl iipdService;

    @Autowired
    IPADServiceImpl ipadService;

    @Autowired
    UserService userService;

    @Autowired
    TechnologyService technologyService;


    @GetMapping("api/v1/its/export/indexes")
    public List<ImportDto> getITSIndexes(@RequestParam("countryId") long countryId, @RequestParam("year") short year){
      return countryTechnologyService.productList(countryId, year);
    }

    @GetMapping("api/v1/its/countries")
    public List<CountryDto> getCountries(){
        return countryService.countriesList();
    }

    @GetMapping("api/v1/its/years")
    public List<Integer> getITSYears(){
        return yearService.yearsITSList();
    }

    @GetMapping("api/v1/its/technologies")
    public List<TechnologyDto> getITSTechnologies(){
        return technologyService.getTechnologies();
    }

    @GetMapping("api/v1/iipd/export/indexes")
    public List<IIPDDto> getIIPDIndexes(@RequestParam("year") int year){
        return iipdService.countriesList(year);
    }

    @GetMapping("api/v1/iipd/years")
    public List<Integer> getIIPDYears(){
        return yearService.yearsIIPDList();
    }

    @GetMapping("api/v1/ipad/indexes")
    public List<IPADDto> getIPADIndexes(@RequestParam("year") int year){
        return ipadService.countriesList(year);
    }

    @GetMapping("api/v1/ipad/years")
    public List<Integer> getIPADYears(){
        return yearService.yearsIPADList();
    }

    @GetMapping("api/v1/its/indexes")
    public List<IndexCountryTechnologyDto> getData(@RequestParam(value = "technologyId", required = false) Long technologyId, @RequestParam(value = "countryId", required = false) Long countryId, @RequestParam(value = "year", required = false) Short year){
        return countryTechnologyService.getData(technologyId, countryId, year);
    }
}
