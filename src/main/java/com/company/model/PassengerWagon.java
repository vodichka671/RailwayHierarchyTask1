package com.company.model;

public abstract class PassengerWagon implements Wagon {
    protected int passengers;
    protected  int baggage;
    PassengerWagon(){
        this.passengers = 0;
        this.baggage = 0;
    }

    public PassengerWagon(int passengers, int baggage) {
        this.passengers = passengers;
        this.baggage = baggage;
    }

    @Override
    public String toString() {
        return ""+getComfort() + getBaggage() +getPassengers();
    }
}
