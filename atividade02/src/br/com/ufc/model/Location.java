package br.com.ufc.model;

import java.util.Calendar;
import java.util.Date;

public class Location {
  private String code;
  private Integer registration;
  private Date shipping;
  private Date delivery;

  public Location(String code, Integer registration, Date shipping, Date delivery) {
    this.code = code;
    this.registration = registration;
    this.shipping = shipping;
    this.delivery = delivery;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Integer getRegistration() {
    return registration;
  }

  public void setRegistration(Integer registration) {
    this.registration = registration;
  }

  public Date getShipping() {
    return shipping;
  }

  public void setShipping(Date shipping) {
    this.shipping = shipping;
  }

  public Date getDelivery() {
    return delivery;
  }

  public void setDelivery(Date delivery) {
    this.delivery = delivery;
  }

  public void fine() {
    if (this.delivery.after(new Date()) || this.delivery.equals(new Date())) 
      System.out.println("SEM MULTA!");
      
    Calendar temp1 = Calendar.getInstance();
    temp1.setTime(new Date());
    
    Calendar temp2 = Calendar.getInstance();
    temp2.setTime(this.delivery);

    temp1.add(Calendar.DATE, - temp2.get(Calendar.DAY_OF_MONTH));
    System.out.println("Atraso: " + temp1.get(Calendar.DAY_OF_MONTH));
  }
}
