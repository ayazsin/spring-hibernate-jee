package com.webspring.dao;

import com.webspring.model.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OrderDao{

    @Autowired
    private SessionFactory sessionFactory;


    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    public List<Order> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Order> query = sessionFactory.getCurrentSession().createQuery("from Order");
        return query.getResultList();
    }
}
