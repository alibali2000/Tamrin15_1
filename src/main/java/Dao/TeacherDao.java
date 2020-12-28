package Dao;

import Entities.Teacher;

import javax.persistence.EntityManager;

public class TeacherDao extends AbstractJPADao<Teacher,Integer>
{

    public TeacherDao(EntityManager entityManager, Class<Teacher> entityClass) {
        super(entityManager, entityClass);
    }
}
