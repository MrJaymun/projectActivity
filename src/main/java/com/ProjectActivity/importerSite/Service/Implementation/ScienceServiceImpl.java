package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Repository.ScienceRepository;
import com.ProjectActivity.importerSite.Service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService {

    @Autowired
    ScienceRepository repository;


    @Override
    public String h1(int countryId, int year) {
        List<Integer> data = new ArrayList<>();
        data = repository.h1(countryId, year);
        if(data.size() == 0){
            return "H1 = 0";
        }
        else{
            String result = "H1 = 1, Technologies: ";
            for (int i = 0; i < data.size(); i++) {
                result = result + data.get(i) + " ";
            }
            return result;
        }
    }

    @Override
    public String h2(int countryId, int year, int technology) {
        List<Integer> data = new ArrayList<>();
        data = repository.h2(countryId, year, technology);
        if(data.size() == 0){
            return "H2 = 0";
        }
        else{
            String result = "H2 = 1, Importers:";
            for (int i = 0; i < data.size(); i++) {
                result = result + " " + data.get(i) ;
            }
            return result;
        }
    }
}
