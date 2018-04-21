package com.sycho.phonebook.controller;

import com.sycho.phonebook.service.PhoneBookService;

import com.sycho.phonebook.model.PhoneBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class PhoneBookController {


    private PhoneBookService phoneBookService;
    @Autowired
    public void setPhoneBookService(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }
    @RequestMapping( path = "/" , method = RequestMethod.GET)
    private List<PhoneBook> initilLoad(){

        return phoneBookService.viewAllContacts();

    }


    @RequestMapping( path = "/phoneBook/add" , consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    private int addPhoneContact(@RequestBody PhoneBook phoneBook ){

        return phoneBookService.addPhoneContact(phoneBook);

    }
    @RequestMapping( path = "/phoneBook/update" ,consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    private int updatePhoneContact(@RequestBody PhoneBook updatePhoneBook){
        return phoneBookService.updatePhoneContact(updatePhoneBook);
    }


    @RequestMapping( path = "/phoneBook/delete/{contactNo}" , method = RequestMethod.DELETE)
    private int delPhoneContact(@PathVariable("contactNo") BigInteger phoneNO ){
        return phoneBookService.delPhoneContact(phoneNO);

    }



        @RequestMapping( path = "/phoneBook/get/contact/phoneNo/{phoneNo}" , method = RequestMethod.GET)
    public List<PhoneBook> getContactByNo(@PathVariable ("phoneNo")BigInteger phoneNo) {
        return phoneBookService.getContactByNo(phoneNo);
    }

    @RequestMapping( path = "/phoneBook/get/contact/firstName/{firstName}" , method = RequestMethod.GET)
    public List<PhoneBook> getContactByName(@PathVariable("firstName")String firstName) {
        return phoneBookService.getContactByName(firstName);
    }


    @RequestMapping( path = "/phoneBook/all" , method = RequestMethod.GET)
    private List<PhoneBook> viewAllContacts(){
        System.out.print("oooooooooooooooo");
        return phoneBookService.viewAllContacts();
    }


}
