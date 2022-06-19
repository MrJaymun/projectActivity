package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country getById(Long id);
    List<Country> findAll();
}

