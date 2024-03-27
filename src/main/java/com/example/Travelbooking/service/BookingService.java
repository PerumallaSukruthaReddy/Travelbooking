package com.example.Travelbooking.service;


import com.example.Travelbooking.model.Booking;
import com.example.Travelbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    public BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {

        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Long id, Booking booking) {
        return bookingRepository.save(booking);
    }


    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
        System.out.println("Booking deleted successfully.");
    }
}
    // Other business logic methods



