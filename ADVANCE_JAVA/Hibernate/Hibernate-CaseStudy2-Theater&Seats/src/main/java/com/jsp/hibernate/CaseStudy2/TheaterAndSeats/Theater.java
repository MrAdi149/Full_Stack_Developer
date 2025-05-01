package com.jsp.hibernate.CaseStudy2.TheaterAndSeats;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theater {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int theaterId;
	
	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	private String theaterName;
	
	@OneToMany(mappedBy="theater",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	private List<Seat> seats;
	
}
