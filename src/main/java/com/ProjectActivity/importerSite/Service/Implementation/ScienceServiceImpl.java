package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.IntegerValue;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.ScienceRepository;
import com.ProjectActivity.importerSite.Service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService {

    @Autowired
    ScienceRepository repository;

    @Autowired
    CountryRepository countryRepository;


    @Override
    public String h1(int countryId, int year) {
        List<IntegerValue> data = new ArrayList<>();
        data = repository.h1(countryId, year);
        if(data.size() == 0){
            return "0;;";
        }
        else{
            String result = "1;";
            for (int i = 0; i < data.size(); i++) {
                result = result + +data.get(i).getId() + " - " + data.get(i).getName() +",";
            }
            result = result.substring(0, result.length()-1);
            result = result + ";";
            return result;
        }
    }


    private String[] h1Values(int countryId, int year) {
        List<IntegerValue> data;
        data = repository.h1(countryId, year);
        String[] result = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i).getId() + " - " + data.get(i).getName();
        }

        return result;

    }

    @Override
    public String h2(int countryId, int year, int technology) {
        List<IntegerValue> data;

            data = repository.h2(countryId, year, technology);
            if(data.size() == 0){
                return "0;;";
            }
            else{
                String result = "1;";
                for (int i = 0; i < data.size(); i++) {
                    result = result + +data.get(i).getId() + " - " + data.get(i).getName() +",";
                }
                result = result.substring(0, result.length()-1);
                result = result + ";";
                return result;
            }
        }



    @Override
    public void doMagic() throws IOException {
        File newFile = new File("data.csv");
        FileWriter fw = new FileWriter(newFile);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("countryId;year;h1Value;h1Tech;h2Value;h2Importers\n");

        List<Country> countries = countryRepository.findAll();

        for (Country country: countries){
            for (int i = 2000; i < 2021; i++) {
                String[] techs = h1Values(Math.toIntExact(country.getId()), i);

                if(techs.length == 0){
                    writer.write(country.getName() + ";" + i + ";" + "0;;0;;" + '\n');
                    //System.out.println(country + ";" + i + ";" + "0;;0;;");
                }
                else{
                    for (int j = 0; j < techs.length; j++) {
                        writer.write(country.getName() + ";" + i + ";1;" + techs[j] + ";" + h2(Math.toIntExact(country.getId()), i, Integer.parseInt(techs[j].split(" ")[0])) + '\n');
                        //System.out.println(country + ";" + j + ";1;" + techs[j] + ";" + h2(country, j, Integer.parseInt(techs[j].split(" ")[0])));
                    }
                }
            }
        }







        writer.close();

    }

}
