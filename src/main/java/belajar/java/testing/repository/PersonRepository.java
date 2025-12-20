package belajar.java.testing.repository;

import belajar.java.testing.data.Person;

public interface PersonRepository {
    Person selectById(String id);

    void insert(Person person);
}
