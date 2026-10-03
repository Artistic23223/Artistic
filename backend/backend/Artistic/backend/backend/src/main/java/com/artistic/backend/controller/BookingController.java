package com.artistic.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistic.backend.model.Booking;
import com.artistic.backend.service.BookingService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable String id) {
        return bookingService.getBookingById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable String id) {
        bookingService.deleteBooking(id);
    }
}