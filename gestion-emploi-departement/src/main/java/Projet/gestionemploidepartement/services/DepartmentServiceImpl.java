package Projet.gestionemploidepartement.services;

import Projet.gestionemploidepartement.entities.Department;
import Projet.gestionemploidepartement.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    final private DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository= departmentRepository;
    }
    @Override
    public void createDepartment(Department d) {
        this.departmentRepository.save(d);
    }

    @Override
    public List<Department> findDepartments() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department findOneDepartments(long id) {

        return this.departmentRepository.findById(id).get();
    }
}
