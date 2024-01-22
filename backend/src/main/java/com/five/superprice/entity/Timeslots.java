package com.five.superprice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "timeslots", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"date_year", "date_month", "date_day", "time_hour", "time_minute"})
})
public class Timeslots {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name ="date_year")
        private int year;

        @Column(name ="date_month")
        private int month;

        @Column(name ="date_day")
        private int day;

        @Column(name ="time_hour")
        private int hour;

        @Column(name ="time_minute")
        private int minute;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}
