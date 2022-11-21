package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.IIPDDto;
import com.ProjectActivity.importerSite.Dto.IPADDto;
import com.ProjectActivity.importerSite.Repository.IPADRepository;
import com.ProjectActivity.importerSite.Service.IPADService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPADServiceImpl implements IPADService {

	@Autowired
	IPADRepository repository;

	@Override
	public List<IPADDto> countriesList(int year) {
		List<IPADDto> data = new ArrayList<>();
		var fromDb = repository.findByYearOrderByIndexDesc(year);
		for (var unit : fromDb) {
			data.add(new IPADDto(unit.country, unit.year, this.round(unit.index, 2), unit.dynamic, unit.alpha3));
		}
		return data;
	}

	public double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = BigDecimal.valueOf(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
