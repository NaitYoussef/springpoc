package com.iristeam.rd.repositories;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {

    @PersistenceContext(name = "spring-poc")
    EntityManager entityManager;

    public void welcome(){
        entityManager.getDelegate();
        System.out.println("Hello world");
    }
}
