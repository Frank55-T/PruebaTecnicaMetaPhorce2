package com.metaphorce.demo.DAO;

import com.metaphorce.demo.Models.Contract;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ContractDAOImp implements ContractDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Contract> getContracts() {
        String query = "FROM Contract";
        return entityManager.createQuery(query).getResultList();
    }
}
