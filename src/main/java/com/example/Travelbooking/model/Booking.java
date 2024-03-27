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
    private Long id;
    private int numberOfMembers;
    private Date startDate;
    private Date endDate;
    private String packageType;
    private String modeOfTransport;

    // Constructors, getters, and setters
}
