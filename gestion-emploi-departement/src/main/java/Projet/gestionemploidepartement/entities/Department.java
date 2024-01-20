package Projet.gestionemploidepartement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // clé primaire
    private long id;
    private String departmentName;
    @OneToMany(mappedBy = "department") // 1 à n
    @JsonBackReference
    Collection<Employee> employees = new ArrayList<>();


}

