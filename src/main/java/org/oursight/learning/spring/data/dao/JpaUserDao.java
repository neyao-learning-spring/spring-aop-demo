package org.oursight.learning.spring.data.dao;

import org.oursight.learning.spring.data.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class JpaUserDao {

    @PersistenceContext
    private EntityManager em;


    @Transactional
    public void save(User user) {
        em.persist(user);

    }


    @Transactional(readOnly = true)
    public List<User> list() {

        return em.createQuery("select u from User u").getResultList();
    }

}

