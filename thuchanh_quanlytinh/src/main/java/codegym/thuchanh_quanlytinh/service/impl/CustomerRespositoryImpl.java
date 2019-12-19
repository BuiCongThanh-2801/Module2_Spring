package codegym.thuchanh_quanlytinh.service.impl;

import codegym.thuchanh_quanlytinh.model.Customer;
import codegym.thuchanh_quanlytinh.respository.CustomerRespository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRespositoryImpl implements CustomerRespository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
