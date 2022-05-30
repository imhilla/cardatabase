package com.hillary.cardatabase.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String brand, model, color, registerNumber;
  private int year, price;

  public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner) {
    super(); // super is used to invoke parent class constructor
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
    this.price = price;
    this.owner = owner;
    this.registerNumber = registerNumber;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner")
  private Owner owner;

  // owner getter and setter
  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return year;
  }
}
