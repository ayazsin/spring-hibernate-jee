package com.webspring.service;

import com.webspring.model.User;

import java.util.List;

public interface Service<T>{
    void save(T t);
    List<T> list();

}
