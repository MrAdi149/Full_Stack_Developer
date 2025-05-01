package com.jsp.hibernate.CaseStudy2.TheaterAndSeats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="seats")
public class Seat {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seatId;
		
	@ManyToOne
	private Theater theater;

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
}
