package com.sycho.phonebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;




import java.math.BigInteger;
@Entity
@Table(name = "PhoneBook")
public class PhoneBook {

    @GenericGenerator(
            name = "phoneIdSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "usersSequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @Id
    @GeneratedValue(generator = "phoneIdSequenceGenerator")
  private long phoneId;
  private String firstName;
  private String lastName;
  private String dob;
  private String email;
  private BigInteger phoneNo;

    public long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(long phoneId) {
        this.phoneId = phoneId;
    }

    public PhoneBook(String firstName, String lastName, String dob, String email, BigInteger phoneNo) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.email = email;
    this.phoneNo = phoneNo;

  }

  public PhoneBook() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BigInteger getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(BigInteger phoneNo) {
    this.phoneNo = phoneNo;
  }


}
