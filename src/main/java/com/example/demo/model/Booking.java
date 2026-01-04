package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {

    public Long getId() {
		return id;
	}

	public Booking(Long id, LocalDate bookingDate, String status, User user, Room room, Owner owner) {
		super();
		this.id = id;
		this.bookingDate = bookingDate;
		this.status = status;
		this.user = user;
		this.room = room;
		this.owner = owner;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate bookingDate;
    private String status; // REQUESTED, APPROVED, CONFIRMED, CANCELLED

    @ManyToOne
    private User user;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Owner owner;

    // getters & setters
}
