package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {

    public Room(Long id, String roomType, double rent, boolean available, Property property) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.rent = rent;
		this.available = available;
		this.property = property;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
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

    private String roomType; // SINGLE / DOUBLE / TRIPLE
    private double rent;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    // getters & setters
}
