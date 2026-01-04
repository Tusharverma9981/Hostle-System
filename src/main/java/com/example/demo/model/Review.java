package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    public Long getId() {
		return id;
	}

	public Review(Long id, int rating, String comment, User user, Property property) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.user = user;
		this.property = property;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;
    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Property property;

    // getters & setters
}
