package com.PaulDev.demo.DAO;

import com.PaulDev.demo.Entity.Instructor;
import com.PaulDev.demo.Entity.InstructorDetail;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDaoImpl implements AppDao{
    private EntityManager entityManager;
    @Autowired
    public AppDaoImpl(EntityManager entity){
        this.entityManager= entity;
    }
    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public InstructorDetail findInstrcutorDetailById(int Id) {
        return entityManager.find(InstructorDetail.class, Id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetail(int Id) {
        InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, Id);
        instructorDetail.getInstructor().setInstructorDetail(null);
        entityManager.remove(instructorDetail);
    }

}
