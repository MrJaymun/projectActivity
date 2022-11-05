package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.CountryDto;
import com.ProjectActivity.importerSite.Dto.TechnologyDto;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Technology;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyRepository;
import com.ProjectActivity.importerSite.Service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    TechnologyRepository technologyRepository;

    @Override
    public List<TechnologyDto> getTechnologies() {

        ArrayList<TechnologyDto> dataDto = new ArrayList<>();
        var data =  technologyRepository.findAll();
        for (Technology technology : data){
            TechnologyDto dto = new TechnologyDto(technology);
            dataDto.add(dto);
        }
        Collections.sort(dataDto, TechnologyDto.COMPARE_BY_TITLE);
        return dataDto;
    }
}
