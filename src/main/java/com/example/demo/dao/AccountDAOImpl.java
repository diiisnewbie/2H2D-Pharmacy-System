package com.example.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TaiKhoan;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AccountDAOImpl implements AccountDAO{
    private EntityManager entityManager;

    @Autowired
    public AccountDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(List<TaiKhoan> dsTaiKhoan) {
        dsTaiKhoan.forEach(i->{
            entityManager.persist(i);
        });
    }
    
}
