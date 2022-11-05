package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Service.YearService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class YearServiceImpl implements YearService {
    @Override
    public List<Integer> yearsITSList() {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 2000; i < 2021; i++) {
            data.add(i);
        }

        return data;
    }

    @Override
    public List<Integer> yearsIIPDList() {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 2000; i < 2019; i++) {
            data.add(i);
        }

        return data;
    }

    @Override
    public List<Integer> yearsIPADList() {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 2000; i < 2018; i++) {
            data.add(i);
        }

        return data;
    }


}
