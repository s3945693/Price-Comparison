package com.five.superprice.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name = "timeslot_id")
    private Timeslots timeslots;

    @Column(name="status")
    private boolean status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timeslots getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(Timeslots timeslots) {
        this.timeslots = timeslots;
    }
}
