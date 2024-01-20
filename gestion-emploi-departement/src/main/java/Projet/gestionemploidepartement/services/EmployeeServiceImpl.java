package Projet.gestionemploidepartement.services;

import Projet.gestionemploidepartement.entities.Employee;
import Projet.gestionemploidepartement.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    final private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;

    }
    @Override
    public void createEmployee(Employee e) {
        this.employeeRepository.save(e);

    }

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(long id) {
        return this.employeeRepository.findById(id).get();
    }
}