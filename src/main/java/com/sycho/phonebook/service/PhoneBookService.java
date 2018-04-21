package com.sycho.phonebook.service;

import com.sycho.phonebook.model.PhoneBook;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public interface PhoneBookService {
    public int addPhoneContact(PhoneBook phoneBook );
    public int updatePhoneContact(PhoneBook updatePhoneBook);
    public int delPhoneContact(BigInteger phoneNo );
    public List<PhoneBook> getContactByNo(BigInteger phoneNo );
    public List<PhoneBook> getContactByName(String firstName );
    public List<PhoneBook> viewAllContacts();

}
