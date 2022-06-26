package com.ProjectActivity.importerSite.Controller;

import com.ProjectActivity.importerSite.Dto.*;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;
import com.ProjectActivity.importerSite.Entity.Technology;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyCountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyRepository;
import com.ProjectActivity.importerSite.Service.CountryTechnologyService;
import com.ProjectActivity.importerSite.Service.IIPDService;
import com.ProjectActivity.importerSite.Service.Implementation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
@CrossOrigin(origins="*")
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


    @GetMapping("getITSIndexes")
    public List<ImportDto> getITSIndexes(@RequestParam("countryId") long countryId, @RequestParam("year") short year){
      return countryTechnologyService.productList(countryId, year);
    }

    @GetMapping("getIIPDIndexes")
    public List<IIPDDto> getIIPDIndexes(@RequestParam("year") int year){
        return iipdService.countriesList(year);
    }

    @GetMapping("getIPADIndexes")
    public List<IPADDto> getIPADIndexes(@RequestParam("year") int year){
        return ipadService.countriesList(year);
    }

    @GetMapping("getITSCountries")
    public List<CountryDto> getCountries(){
        return countryService.countriesList();
    }

    @GetMapping("getITSYears")
    public List<Integer> getITSYears(){
        return yearService.yearsITSList();
    }

    @GetMapping("getIIPDYears")
    public List<Integer> getIIPDYears(){
        return yearService.yearsIIPDList();
    }

    @GetMapping("getIPADYears")
    public List<Integer> getIPADYears(){
        return yearService.yearsIPADList();
    }


}
