package com.sycho.phonebook.dao;

import com.sycho.phonebook.model.PhoneBook;
import org.springframework.stereotype.Repository;


import java.math.BigInteger;
import java.util.List;

@Repository
public interface PhoneBookDao {

    public int addPhoneContact(PhoneBook phoneBook );
    public int updatePhoneContact(PhoneBook updatePhoneBook);
    public int delPhoneContact(BigInteger phoneNo );
    public List<PhoneBook> findContactByNo(BigInteger phoneNo );
    public List<PhoneBook> findContactByName(String firstName );
    public List<PhoneBook> viewAllContacts();



}
