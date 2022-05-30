package com.hillary.cardatabase.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Owner {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ownerid;
  private String firstname, lastname;

  public Owner() {
  }

  public Owner(String firstname, String lastname) {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
  }

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private List<Car> cars;

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public long getOwnerId() {
    return ownerid;
  }

  public void setOwnerId(long ownerid) {
    this.ownerid = ownerid;
  }

  public String getFirstName() {
    return firstname;
  }

  public void setFirstName(String firstname) {
    this.firstname = firstname;
  }

  public String getLastName() {
    return lastname;
  }

  public void setLastName(String lastname) {
    this.lastname = lastname;
  }
}
