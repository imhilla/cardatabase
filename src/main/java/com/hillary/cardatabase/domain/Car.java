package com.hillary.cardatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String brand, model, color, registerNumber;
  private int year, price;

  public Car() {
  }

  public Car(String brand, String model, String color, int year, int price) {
    super();
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
    this.price = price;
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
