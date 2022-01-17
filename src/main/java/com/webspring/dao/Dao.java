package com.webspring.dao;

import com.webspring.model.User;

import java.util.List;

public interface Dao<T> {
    void save(T t);
    List<T> list();


}
