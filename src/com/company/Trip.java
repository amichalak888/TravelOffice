package com.company;

public class Trip {
    Date start;
    Date end;
    String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public String getInfo(Trip trip) {
        return "Poczatek wycieki: "+ trip.start.day+trip.start.month+trip.start.year +
                "Wycieczka kończy się: " + trip.end.day + trip.end.month +trip.end.year+
                "Cel podróży to: " + trip.destination;


    }


}

