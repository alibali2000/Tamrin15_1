package Dao;

import javax.persistence.EntityManager;
import javax.swing.border.AbstractBorder;

public abstract class AbstractJPADao<T,U>
{
    private EntityManager entityManager;
    private Class<T> entityClass;
    public AbstractJPADao(EntityManager entityManager,Class<T> entityClass)
    {
        this.entityManager=entityManager;
        this.entityClass=entityClass;
    }
    public void save (T entity)
    {
        entityManager.persist(entity);
    }

    public T load(U id)
    {
        return  entityManager.find(entityClass,id);
    }
    public void delete(T entity)
    {
        entityManager.remove(entity);
    }
    public void update(T entity)
    {
        entityManager.merge(entity);
    }
}
