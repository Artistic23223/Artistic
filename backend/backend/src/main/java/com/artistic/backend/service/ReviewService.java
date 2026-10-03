package com.artistic.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistic.backend.model.Review;
import com.artistic.backend.repository.ReviewRepository;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(String id) {
        return reviewRepository.findById(id);
    }

    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }
}