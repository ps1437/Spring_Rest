package com.sycho.phonebook.dao;

import com.sycho.phonebook.model.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DummyRepository extends CrudRepository<PhoneBook, Long> {
    List<PhoneBook> findByFirstName(String firstName);
    List<PhoneBook> findByContactNo(String phoneNo);
    int delPhoneContact(String phoneNo);

}