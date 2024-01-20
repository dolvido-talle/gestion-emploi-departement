package Projet.gestionemploidepartement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

    private String employeeFirstName;

    private String employeeLastName;

    private String employeePhone;

    private long departmentId;

    public String getEmployeePhoneNumber() {
        return this.getEmployeePhone();
    }
}
