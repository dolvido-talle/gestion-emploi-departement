package Projet.gestionemploidepartement.services;

import Projet.gestionemploidepartement.entities.Department;

import java.util.List;

public interface DepartmentService {

    void createDepartment(Department d);
    List<Department> findDepartments();
    Department findOneDepartments(long id);


}
