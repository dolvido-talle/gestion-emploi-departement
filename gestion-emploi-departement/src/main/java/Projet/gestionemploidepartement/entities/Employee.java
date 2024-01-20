package Projet.gestionemploidepartement.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhone;
   @ManyToOne
   @JoinColumn(name = "department_id")
   @JsonBackReference
   private Department department;


    public void setDepartement(Department department) {
        this.department = department;
    }

    public Department getDepartement() {
        return department;
    }
}