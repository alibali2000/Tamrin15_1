package Entities;

import javax.persistence.*;

@Entity
public class Address extends Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private Integer adId;
    @Column(name = "street_number", nullable = false)
    private Integer streetNumber;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String city;
    @Column(name = "postal_address", nullable = false, unique = true)
    private Integer postalAddress;
    @Column(name = "postal_code", nullable = false, unique = true)
    private Integer postalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_ad_student",nullable = false)
    private Student adStudent;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_ad_teacher",nullable = false)
    private Teacher adTeacher;

    public Address() {
    }

    public Address(Integer streetnumber, String state, String city,
                   Integer postaladdress, Integer postalcode) {
        this.streetNumber = streetnumber;
        this.state = state;
        this.city = city;
        this.postalAddress = postaladdress;
        this.postalCode = postalcode;
    }

    public Integer getAdId() {
        return adId;
    }

    public Integer getPostalAddress() {
        return postalAddress;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalAddress(Integer postalAddress) {
        this.postalAddress = postalAddress;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Student getAdStudent() {
        return adStudent;
    }

    public void setAdStudent(Student adStudent) {
        this.adStudent = adStudent;
    }

    public Teacher getAdTeacher() {
        return adTeacher;
    }

    public void setAdTeacher(Teacher adTeacher) {
        this.adTeacher = adTeacher;
    }

}