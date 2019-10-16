package com.tw.apistackbase.services;

import com.tw.apistackbase.models.Company;
import com.tw.apistackbase.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class ShowService {
    List<Company> companyList;

    public ShowService() {
        companyList = new ArrayList<>();
        companyList.add(getFacebookCompany());
        companyList.add(getAlibabaCompany());
    }

    private Company getFacebookCompany() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Zucc", 35, "robot", 1_000_000_000));
        employeeList.add(new Employee(1, "Cambridge Analytica", 6, "company", 1_000_000));

        return new Company("Facebook", employeeList);
    }

    private Company getAlibabaCompany() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(4, "alibaba1", 20, "male", 6000));
        employeeList.add(new Employee(11, "tengxun2", 19, "female", 7000));
        employeeList.add(new Employee(6, "alibaba3", 19, "male", 8000));

        Company company = new Company("Alibaba", employeeList);
        return company;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }
}
