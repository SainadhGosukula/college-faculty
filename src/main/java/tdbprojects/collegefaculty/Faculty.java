package tdbprojects.collegefaculty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Faculty {
    @Id
    @GeneratedValue
    private long faculty_id;
    private String faculty_name;
    private String faculty_address;
    private String faculty_phone;
    private double faculty_salary;
    private String faculty_email;
}
