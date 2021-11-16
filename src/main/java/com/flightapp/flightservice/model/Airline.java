package com.flightapp.flightservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "airline")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String trip;
    private String fromLocation;
    private String toLocation;
    private String departureDate;
    private String returnDate;
    private String PreferredSeat;
    private Integer totalSeat;

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPreferredSeat() {
        return PreferredSeat;
    }

    public void setPreferredSeat(String preferredSeat) {
        PreferredSeat = preferredSeat;
    }

    public Integer getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }
}
