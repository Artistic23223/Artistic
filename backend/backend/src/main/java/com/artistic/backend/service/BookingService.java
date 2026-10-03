package com.artistic.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistic.backend.model.Booking;
import com.artistic.backend.repository.BookingRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(String id) {
        return bookingRepository.findById(id);
    }

    public void deleteBooking(String id) {
        bookingRepository.deleteById(id);
    }
}