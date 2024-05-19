package com.railwaySystem.railwayTicketing.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="tickets")
public class tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_id;

    @Column(name = "seat_number")
    private int seat_number;

    @Column(name = "booking_time")
    private Date booking_time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private users user;


    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public Date getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(Date booking_time) {
        this.booking_time = booking_time;
    }

    public users getUser() {
        return user;
    }

    public void setUser(users user) {
        this.user = user;
    }
}
