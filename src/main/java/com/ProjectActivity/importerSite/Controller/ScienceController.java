package com.ProjectActivity.importerSite.Controller;

import com.ProjectActivity.importerSite.Dto.ImportDto;
import com.ProjectActivity.importerSite.Service.Implementation.ScienceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(exposedHeaders = { "Access-Control-Allow-Origin" }, allowCredentials = "true", originPatterns = "*")
@RestController
public class ScienceController {

    @Autowired
    ScienceServiceImpl scienceService;

    @GetMapping("api/v1/h1")
    @Transactional
    public String getH1(@RequestParam("countryId") int countryId, @RequestParam("year") short year) {
        return scienceService.h1(countryId, year);
    }

    @GetMapping("api/v1/h2")
    @Transactional
    public String getH2(@RequestParam("countryId") int countryId, @RequestParam("year") short year, @RequestParam("technology") short technology) {
        return scienceService.h2(countryId, year, technology);
    }
}
