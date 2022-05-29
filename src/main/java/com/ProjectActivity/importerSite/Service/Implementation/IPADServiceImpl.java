package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.IIPDDto;

import com.ProjectActivity.importerSite.Dto.IPADDto;
import com.ProjectActivity.importerSite.Repository.IPADRepository;
import com.ProjectActivity.importerSite.Service.IPADService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IPADServiceImpl implements IPADService {

    @Autowired
    IPADRepository repository;
    @Override
    public List<IPADDto> countriesList(int year) {
        List<IPADDto> data = new ArrayList<>();
        var fromDb = repository.findByYear(year);
        for (var unit : fromDb){
            data.add(new IPADDto(unit.country, unit.year, unit.index, unit.dynamic));
        }
        return data;
    }
}
