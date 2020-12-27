package br.com.ufc.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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
    if (this.delivery.after(new Date()) || this.delivery.equals(new Date())) {
      System.out.println("SEM MULTA!");
    }

    Date nowDate = new Date();
    int multa;

    long DifEmMil = Math.abs(nowDate.getTime() - this.delivery.getTime());

    Long diff = TimeUnit.DAYS.convert(DifEmMil, TimeUnit.MILLISECONDS);

    multa = Integer.valueOf(diff.toString());
    multa = (multa) * 2;

    System.out.println("Multa de " + multa);
  }
}
