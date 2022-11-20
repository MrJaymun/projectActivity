package com.ProjectActivity.importerSite.Dto;

import com.ProjectActivity.importerSite.Entity.Code_hs96;
import java.util.List;
import java.util.Set;

public class ProductDto {

	public String productName;
	//public List<String> hs96;
	/*
    public ProductDto(String productName,   List<String> hs96) {
        this.productName = productName;
        this.hs96 = hs96;
    }

     */
	public Set<Code_hs96> hs96;

	public ProductDto(String productName, Set<Code_hs96> hs96) {
		this.productName = productName;
		this.hs96 = hs96;
	}
}
