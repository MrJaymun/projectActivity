package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.IPAD;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPADRepository extends JpaRepository<IPAD, Long> {
	List<IPAD> findByYearOrderByIndexDesc(int year);
}
