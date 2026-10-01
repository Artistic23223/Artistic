package com.artistic.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    private int rating; // e.g., 1 to 5 stars
    private String comment;
    private String artistId;
    private String userId;

    public Review() {
    }

    public Review(int rating, String comment, String artistId, String userId) {
        this.rating = rating;
        this.comment = comment;
        this.artistId = artistId;
        this.userId = userId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public String getArtistId() { return artistId; }
    public void setArtistId(String artistId) { this.artistId = artistId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}