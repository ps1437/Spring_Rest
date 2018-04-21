package com.sycho.phonebook.dao;

import com.sycho.phonebook.model.DummyPhoneBook;
import com.sycho.phonebook.model.PhoneBook;
import org.springframework.stereotype.Repository;


import java.math.BigInteger;
import java.util.List;

@Repository
public class PhoneBookDaoImpl implements PhoneBookDao {

    private List<PhoneBook> phoneBookList;
    private DummyRepository dummyRepository;

    public void setDummyRepository(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @Override
    public int addPhoneContact(PhoneBook phoneBook) {


        dummyRepository.save(phoneBook);
        return 1;
    }

    @Override
    public int updatePhoneContact(PhoneBook updatePhoneBook) {

        return 1;
    }

    @Override
    public int delPhoneContact(BigInteger phoneNo) {
       return   dummyRepository.delPhoneContact(phoneNo.toString());

    }

    @Override
    public List<PhoneBook> findContactByNo(BigInteger phoneNo) {

        return dummyRepository.findByContactNo(phoneNo.toString());
          }

    @Override
    public List<PhoneBook> findContactByName(String firstName) {

        return dummyRepository.findByFirstName(firstName);
    }

    @Override
    public List<PhoneBook> viewAllContacts() {
        phoneBookList = DummyPhoneBook.getDummyList();
        return phoneBookList;
    }
}
