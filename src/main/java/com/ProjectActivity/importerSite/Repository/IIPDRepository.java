package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.IIPD;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIPDRepository extends JpaRepository<IIPD, Long> {
	List<IIPD> findByYearOrderByIndexDesc(int year);
}
