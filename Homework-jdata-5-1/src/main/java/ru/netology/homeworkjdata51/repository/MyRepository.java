package ru.netology.homeworkjdata51.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.homeworkjdata51.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public class MyRepository {
    @Autowired
    private PersonRepository personRepository;

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Persons> getPersonsByAge(Integer age) {
        return personRepository.findByContact_AgeLessThan(age, Sort.by("contact.age"));
    }

    public Optional<Persons> getPersonsByNameSurname(String name, String surname) {
        return personRepository.findByContact_NameAndContact_Surname(name, surname);
    }
}
