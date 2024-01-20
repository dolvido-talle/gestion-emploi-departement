package Projet.gestionemploidepartement.repositories;

import Projet.gestionemploidepartement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository


public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

