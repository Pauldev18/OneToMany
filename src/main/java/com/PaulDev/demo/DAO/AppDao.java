package com.PaulDev.demo.DAO;

import com.PaulDev.demo.Entity.Instructor;
import com.PaulDev.demo.Entity.InstructorDetail;

public interface AppDao {
    void save(Instructor instructor);
    InstructorDetail findInstrcutorDetailById(int Id);
    void deleteInstructorDetail(int Id);
}
