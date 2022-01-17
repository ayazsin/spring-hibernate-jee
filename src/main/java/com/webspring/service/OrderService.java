package com.webspring.service;

import com.webspring.dao.Dao;
import com.webspring.dao.OrderDao;
import com.webspring.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class OrderService  {

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void save(Order order) {
        orderDao.save(order);
    }

    @Transactional(readOnly = true)
    public List<Order> list() {
        return orderDao.list();
    }

    @Transactional
    public List<Order> listOfDisputed() {
        return orderDao.list().stream().filter(t -> t.getStatus().equals("Disputed")).collect(Collectors.toList());
    }

}
