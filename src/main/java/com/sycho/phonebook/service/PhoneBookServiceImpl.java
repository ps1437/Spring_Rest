package com.sycho.phonebook.service;

import com.sycho.phonebook.dao.PhoneBookDao;
import com.sycho.phonebook.model.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class PhoneBookServiceImpl implements  PhoneBookService {


    private PhoneBookDao phoneBookDao;

    @Autowired
    public void setPhoneBookDao(PhoneBookDao phoneBookDao) {
        this.phoneBookDao = phoneBookDao;
    }

    @Override
    public int addPhoneContact(PhoneBook phoneBook) {
        return phoneBookDao.addPhoneContact(phoneBook);
    }

    @Override
    public int updatePhoneContact(PhoneBook updatePhoneBook) {
        return phoneBookDao.updatePhoneContact(updatePhoneBook);
    }

    @Override
    public int delPhoneContact(BigInteger phoneNo) {
        return phoneBookDao.delPhoneContact(phoneNo);
    }

    @Override
    public List<PhoneBook> getContactByNo(BigInteger phoneNo) {
        return phoneBookDao.findContactByNo(phoneNo);
    }

    @Override
    public List<PhoneBook> getContactByName(String firstName) {
        return phoneBookDao.findContactByName(firstName);
    }

    @Override
    public List<PhoneBook> viewAllContacts() {
        return phoneBookDao.viewAllContacts();
    }
}
