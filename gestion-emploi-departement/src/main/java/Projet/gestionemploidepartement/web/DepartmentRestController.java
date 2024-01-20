package Projet.gestionemploidepartement.web;


import Projet.gestionemploidepartement.entities.Department;
import Projet.gestionemploidepartement.models.DepartmentModel;
import Projet.gestionemploidepartement.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/api")
public class DepartmentRestController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/departments")
    void createDepartment(@RequestBody DepartmentModel model){
        Department department = new Department();
        department.setDepartmentName(model.getDepartmentName());
        this.departmentService.createDepartment(department);

    }
    @GetMapping("/departments")
    List<Department> Departments(){

        return this.departmentService.findDepartments();
    }
    @GetMapping("/departments/{id}")
    Department getOneDepartment(@PathVariable long id){

        return this.departmentService.findOneDepartments(id);
    }


}
