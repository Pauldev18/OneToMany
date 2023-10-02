package com.PaulDev.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int Id;
    @Column(name= "first_name")
    private String fisrtName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="instructor_detail_id")
    private InstructorDetail instructorDetail;

    public Instructor() {
    }

    public Instructor(String fisrtName, String lastName, String email) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public void setInstructorDetail(InstructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "Id=" + Id +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", instructorDetail=" + instructorDetail +
                '}';
    }
}
