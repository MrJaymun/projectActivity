package com.ProjectActivity.importerSite.Controller;

import com.ProjectActivity.importerSite.Dto.TechnologyCountryDto;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;
import com.ProjectActivity.importerSite.Entity.Technology;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyCountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyRepository;
import com.ProjectActivity.importerSite.Service.CountryTechnologyService;
import com.ProjectActivity.importerSite.Service.Implementation.CountryTechnologyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("table")
public class TableController {


   @Autowired
    CountryTechnologyServiceImpl countryTechnologyService;


    @GetMapping("getTechnologyList")
    public List<TechnologyCountryDto> getTechnologyList(@RequestParam("id") long id, @RequestParam("year") short year){
      return countryTechnologyService.productList(id, year);
    }

}
