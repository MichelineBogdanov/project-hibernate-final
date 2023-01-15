package com.javarush.dao;

import org.hibernate.SessionFactory;

public class CityDAO {

    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
