package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.CountryDto;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<CountryDto> countriesList() {
        ArrayList<CountryDto> dataDto = new ArrayList<>();
        var data = countryRepository.findAll();
        for (Country country : data){
            CountryDto dto = new CountryDto(Math.toIntExact(country.getId()), country.getName());
            dataDto.add(dto);
        }
        Collections.sort(dataDto, CountryDto.COMPARE_BY_NAME);
        return dataDto;
    }
}
