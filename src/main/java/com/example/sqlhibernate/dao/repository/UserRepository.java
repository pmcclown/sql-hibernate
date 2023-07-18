package com.example.sqlhibernate.dao.repository;

import com.example.sqlhibernate.dao.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from User p where p.cityOfLiving = :city")
                .setParameter("city", city)
                .getResultList();
    }
}