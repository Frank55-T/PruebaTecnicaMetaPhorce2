package com.metaphorce.demo.controllers;
import com.metaphorce.demo.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.metaphorce.demo.DAO.EmployeeDAOImp;
import com.metaphorce.demo.DAO.ContractDAOImp;
import com.metaphorce.demo.Models.Contract;

import java.util.List;
@RestController
public class Controller {
    @Autowired
    private EmployeeDAOImp employeeDAOImpDAO;

    @Autowired
    private ContractDAOImp contractDAOImpDAO;

    @RequestMapping(value = "/employees")
    public List<Employee> getEmployees(){
        return employeeDAOImpDAO.getEmployees();
    }

    @RequestMapping(value = "/employees/active")
    public List<Employee> getActiveEmployees(){
        return employeeDAOImpDAO.getActiveEmployees();
    }

    @RequestMapping(value = "/employees/{id}")
    public Employee getEmployee(int id){
        return employeeDAOImpDAO.getEmployee(id);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteEmployee(int id){
        try {
            employeeDAOImpDAO.deleteEmployee(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping(value = "/addEmployee")
    public void addEmployee(Employee employee){
        try {
            employeeDAOImpDAO.addEmployee(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping(value = "/updateEmployee")
    public void updateEmployee(Employee employee){
        try {
            employeeDAOImpDAO.updateEmployee(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping(value = "/Contracts")
    public List<Contract> getContracts(){
        return contractDAOImpDAO.getContracts();
    }
}
