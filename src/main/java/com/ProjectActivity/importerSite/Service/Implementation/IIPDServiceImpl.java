package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.IIPDDto;
import com.ProjectActivity.importerSite.Repository.IIPDRepository;
import com.ProjectActivity.importerSite.Service.IIPDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IIPDServiceImpl implements IIPDService {

    @Autowired
    IIPDRepository repository;
    @Override
    public List<IIPDDto> countriesList(int year) {
        List<IIPDDto> data = new ArrayList<>();
        var fromDb = repository.findByYear(year);
        for (var unit : fromDb){
            data.add(new IIPDDto(unit.country, unit.year, unit.index, unit.dynamic));
        }
        return data;
    }
}
