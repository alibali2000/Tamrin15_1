package Dao;

import Entities.Student;

import javax.persistence.EntityManager;

public class StudentDao extends AbstractJPADao<Student,Integer>
{

    public StudentDao(EntityManager entityManager, Class<Student> entityClass) {
        super(entityManager, entityClass);
    }
}
