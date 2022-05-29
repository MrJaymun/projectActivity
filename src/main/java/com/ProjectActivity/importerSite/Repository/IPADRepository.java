package com.ProjectActivity.importerSite.Repository;


import com.ProjectActivity.importerSite.Entity.IPAD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPADRepository extends JpaRepository<IPAD, Long> {

    List<IPAD> findByYear(int year);
}
