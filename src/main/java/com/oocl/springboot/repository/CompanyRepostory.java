package com.oocl.springboot.repository;

import com.oocl.springboot.modle.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepostory extends JpaRepository<Company,Integer> {


}
