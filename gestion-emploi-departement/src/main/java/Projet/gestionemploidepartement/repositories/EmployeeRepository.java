package Projet.gestionemploidepartement.repositories;

import Projet.gestionemploidepartement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
