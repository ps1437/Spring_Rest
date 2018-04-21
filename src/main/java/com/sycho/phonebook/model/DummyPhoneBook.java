package com.sycho.phonebook.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DummyPhoneBook {
  static  List<PhoneBook>  list = new ArrayList<PhoneBook>();
     public static List<PhoneBook> getDummyList(){


         list.add(  new PhoneBook("Praveen","Soni","10/06/1992","xxxx@gamil.com", BigInteger.ZERO));
         list.add(new PhoneBook("Ravi","Sinha","10/02/1992","yyyy@gamil.com",BigInteger.TEN));
         list.add( new PhoneBook("Anu","Narendra","10/06/1994","zzzzzz@gamil.com",BigInteger.TEN));
         return  list;

     }
}
