package Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "tch_first_name",nullable = false)
    private String firstName;
    @Column(name = "tch_last_name",nullable = false)
    private String lastName;
    @Column(name = "teacher_code",nullable = false,unique = true)
    private Integer teachertCode;
    @Column(nullable = false)
    private Double salary;
    @Column(name = "tch_birthday",nullable = false)
    private LocalDate birthDay;


    public Teacher(){}
    public Teacher(String firstName,String lastName,Integer teacherCode,Double salary,LocalDate birthday)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.teachertCode=teacherCode;
        this.salary=salary;
        this.birthDay=birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public Integer getTeachertCode() {
        return teachertCode;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeachertCode(Integer teachertCode) {
        this.teachertCode = teachertCode;
    }

}
