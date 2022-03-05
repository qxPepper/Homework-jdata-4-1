package ru.netology.homeworkjdata51.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.homeworkjdata51.entity.Contact;
import ru.netology.homeworkjdata51.entity.Persons;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Persons, Contact> {
    List<Persons> findByCityOfLiving(String cityOfLiving);

    List<Persons> findByContact_AgeLessThan(Integer age, Sort sort);

    Optional<Persons> findByContact_NameAndContact_Surname(String name, String surname);
}
