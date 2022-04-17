package com.ProjectActivity.importerSite.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("table")
public class TableController {

    @GetMapping("check")
    public String firstCheck(){
        return "Работает!";
    }

    @GetMapping("checkId")
    public String firstCheck(@RequestParam("id") long id){
        return "Id: " + id;
    }
}
