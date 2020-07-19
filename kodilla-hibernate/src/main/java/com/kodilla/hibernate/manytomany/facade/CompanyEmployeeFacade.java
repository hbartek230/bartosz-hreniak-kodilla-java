package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> selectCompany(String companyPartName) {
        return companyDao.selectCompanyByName("%" + companyPartName + "%");
    }

    public List<Employee> selectEmployee(String employeePartName) {
        return employeeDao.findEmployeeByLastname("%" + employeePartName + "%");
    }
}
