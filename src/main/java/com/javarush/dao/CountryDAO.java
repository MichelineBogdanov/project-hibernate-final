package com.javarush.dao;

import org.hibernate.SessionFactory;

public class CountryDAO {

    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
