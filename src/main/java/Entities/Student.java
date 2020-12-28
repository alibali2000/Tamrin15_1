package Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="student_id")
    private Integer studentID;
    @Column(name = "st_first_name",nullable = false)
    private String firstname;
    @Column(name = "st_last_name",nullable = false)
    private String lastname;
    @Column(name = "student_code",unique = true,nullable = false)
    private Integer studentCode;
    @Column(name = "st_birthday")
    private LocalDate birthDay;

    @OneToMany(mappedBy = "adStudent")
    @Column(name = "fk_st_addresses")
    private Set<Address> staddresses;
    @ManyToMany
    @JoinTable(name = "st_teachers",joinColumns = @JoinColumn(name ="fk_st_tch_id")
            ,inverseJoinColumns = @JoinColumn(name = "fk_st_id"))
    private Set<Teacher> stTeachers;

    public Student(){}
    public Student(String firstname,String lastName,Integer studentCode,LocalDate birthday)
    {
        this.firstname=firstname;
        this.lastname=lastName;
        this.studentCode=studentCode;
        this.birthDay=birthday;
    }



    public Integer getStudentID() {
        return studentID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    public Set<Address> getStaddresses() {
        return staddresses;
    }

    public void setStaddresses(Set<Address> staddresses) {
        this.staddresses = staddresses;
    }

    public Set<Teacher> getStTeachers() {
        return stTeachers;
    }

    public void setStTeachers(Set<Teacher> stTeachers) {
        this.stTeachers = stTeachers;
    }
}
