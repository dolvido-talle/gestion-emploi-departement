package Projet.gestionemploidepartement.web;


import Projet.gestionemploidepartement.entities.Department;
import Projet.gestionemploidepartement.entities.Employee;
import Projet.gestionemploidepartement.models.EmployeeModel;
import Projet.gestionemploidepartement.services.DepartmentService;
import Projet.gestionemploidepartement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value= "/api")

public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/employees")
    void createEmployee(@RequestBody EmployeeModel e){

        Employee employee= new Employee();

        employee.setEmployeeFirstName(e.getEmployeeFirstName());

        employee.setEmployeeLastName(e.getEmployeeLastName());

        employee.setEmployeePhone(e.getEmployeePhoneNumber());

        employee.setDepartement(this.departmentService.findOneDepartments(e.getDepartmentId()));
        this.employeeService.createEmployee(employee);

    }
/*
    @PostMapping("/employees")

    public ResponseEntity<String> createEmployee(@RequestBody EmployeeModel e) {
        Employee employee = new Employee();

        employee.setEmployeeFirstName(e.getEmployeeFirstName());
        employee.setEmployeeLastName(e.getEmployeeLastName());
        employee.setEmployeePhone(e.getEmployeePhoneNumber());
        long departmentId = e.getDepartmentId();
        System.out.println("ID du département fourni : " + departmentId);
        Department department = this.departmentService.findOneDepartments(e.getDepartmentId());
        if (department != null) {
            employee.setDepartement(department);
            this.employeeService.createEmployee(employee);
            return new ResponseEntity<>("Employé créé avec succès", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Le département spécifié n'existe pas", HttpStatus.NOT_FOUND);
        }
    }
*/
    @GetMapping("/employees")
    List<Employee> findAllEmployees(){

        return this.employeeService.getEmployees();
    }
    @GetMapping("/employees/{id}")
    Employee getOneEmployee(@PathVariable long id){

        return this.employeeService.getOneEmployee(id);
    }


}
