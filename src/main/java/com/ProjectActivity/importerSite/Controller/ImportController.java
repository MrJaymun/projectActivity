package com.ProjectActivity.importerSite.Controller;

import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("import")
public class ImportController {

    @GetMapping("country")
    public List<Country> country(){
        return null;
    }

    //Если мы будем отправлять на фронт страны и их id
    @GetMapping("technology")
    public List<Country_Technology_Unit> countryYearTechnologies(@RequestParam("id") int countryId, @RequestParam("year") short year){
        return null;
    }

}
