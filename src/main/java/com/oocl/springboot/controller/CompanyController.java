package com.oocl.springboot.controller;

import com.oocl.springboot.modle.Company;
import com.oocl.springboot.repository.CompanyRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    @Autowired
    private CompanyRepostory companyRepostory;

    @GetMapping("/companies")
    public List<Company> findAll() {
        return companyRepostory.findAll();
    }

    @PostMapping("/companies")
    public Company createCompany(@RequestBody Company company) {
        return companyRepostory.save(company);
    }

    @GetMapping("/companies/{companyId}")
    public Optional<Company> findCompanyById(@PathVariable Integer companyId) {
        return companyRepostory.findById(companyId);
    }

    @PutMapping("/companies/{companyId}")
    public Company updateCompany(@PathVariable Integer companyId, @RequestBody Company company) {
        company.setCompanyId(companyId);
        return companyRepostory.save(company);
    }

    @DeleteMapping("/companies/{companyId}")
    public void deleteCompany(@PathVariable Integer companyId) {
        Company company = new Company();
        company.setCompanyId(companyId);
        companyRepostory.delete(company);
    }
}
