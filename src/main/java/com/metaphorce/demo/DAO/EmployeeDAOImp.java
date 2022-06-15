package com.metaphorce.demo.DAO;

import com.metaphorce.demo.Models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImp implements EmployeeDAO {

    /***
     * Entity to manage the connection
     * between database and controller
     */
    @PersistenceContext
    EntityManager entityManager;

    /***
     *
     * @return a list with Employees of the DB
     */
    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }

    /***
     *
     * @return A list with Employees who are active in the register
     * of the database
     */
    @Override
    public List<Employee> getActiveEmployees() {
        String query = "FROM Employee WHERE isActive=1";
        return entityManager.createQuery(query).getResultList();
    }

    /***
     *
     * @param id The id of an employee
     * @return an employee who contain the id
     */
    @Override
    public Employee getEmployee(int id) {
        String query = "FROM Employee WHERE EmployeeId="+id;
        return (Employee) entityManager.createQuery(query).getResultList().get(0);
    }

    /***
     *
     * @param employee An employee to add to the database
     * @throws Exception if the employee contain a duplicate email in
     * the database
     */
    @Override
    public void addEmployee(Employee employee) throws Exception {
        if(isEmail(employee)){
            throw  new Exception("The email already exists in DB");
        }else{
            entityManager.merge(employee);
        }

    }

    /***
     *
     * @param employee An employee to be updated in the database
     */
    @Override
    public void updateEmployee(Employee employee)  {
        entityManager.merge(employee);

    }

    /***
     *
     * @param id The id of the employee who will be deleted from
     *           the DATABASE
     * @throws Exception if the id of the employee doesn't exist
     */
    @Override
    public void deleteEmployee(int id) throws Exception {
        Employee employee = getEmployee(id);
        if(employee!=null){
            entityManager.remove(employee);
        }else{
            throw new Exception("The employee doesn't exists");
        }
    }

    /***
     *
     * @param employee Verifies if the employee contain a duplicate email
     * @return @True if the employee contains a duplicate email @False otherwise
     */
    boolean isEmail(Employee employee){
        String query = "FROM Employee WHERE email='"+employee.getEmail()+"'";
        if(entityManager.createQuery(query).getResultList().size()>0){
            return true;
        }
        return false;
    }
}
