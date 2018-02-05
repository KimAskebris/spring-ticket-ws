package com.service.ticket.model;

import java.io.Serializable;

public class Ticket implements Serializable {
    
    private Integer id;
    private String depature;
    private String destination;
    private Integer price;
    private String date;

    public Ticket() {
    }

    public Ticket(Integer id, String depature, String destination, Integer price, String date) {
        this.id = id;
        this.depature = depature;
        this.destination = destination;
        this.price = price;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", depature=" + depature + ", destination=" + destination + ", price=" + price + ", date=" + date + '}';
    }
    
    
    
    
    
    
}
