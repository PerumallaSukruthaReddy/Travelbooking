package com.example.Travelbooking.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public int numberOfMembers;
    public Date startDate;
    public Date endDate;
    public String packageType;
    public String modeOfTransport;

    // Constructors, getters, and setters
}
