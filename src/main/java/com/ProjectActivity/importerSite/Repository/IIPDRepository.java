package com.ProjectActivity.importerSite.Repository;


import com.ProjectActivity.importerSite.Entity.IIPD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIPDRepository extends JpaRepository<IIPD, Long> {

    List<IIPD> findByYear(int year);
}
