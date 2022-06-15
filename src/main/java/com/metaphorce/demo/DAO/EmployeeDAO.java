package com.metaphorce.demo.DAO;

import com.metaphorce.demo.Models.Employee;

import javax.transaction.Transactional;
import java.util.List;


public interface EmployeeDAO {
    List<Employee> getEmployees();
    List<Employee> getActiveEmployees();
    Employee getEmployee(int id);

    void addEmployee(Employee employee) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(int id) throws Exception;
}
