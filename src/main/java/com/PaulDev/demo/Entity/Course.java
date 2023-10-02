package com.PaulDev.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int Id;
    @Column(name="title")
    private String TieuDe;
    @ManyToOne(cascade =
                    {CascadeType.DETACH, CascadeType.MERGE,
                    CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public Course() {
    }

    public Course(String tieuDe) {
        TieuDe = tieuDe;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", TieuDe='" + TieuDe + '\'' +
                '}';
    }
}
