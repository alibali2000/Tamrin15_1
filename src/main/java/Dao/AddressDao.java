package Dao;

import Entities.Address;

import javax.persistence.EntityManager;

public class AddressDao extends AbstractJPADao<Address,Integer>
{

    public AddressDao(EntityManager entityManager, Class<Address> entityClass) {
        super(entityManager, entityClass);
    }
}
