package ru.netology.homeworkjdata41.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Transactional
    public List<String> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p.contact.name from Persons p where p.cityOfLiving=:city");
        query.setParameter("city", city);

        return query.getResultList();
    }
}
