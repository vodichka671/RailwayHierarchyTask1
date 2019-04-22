package com.company.model;

public class Compartment extends PassengerWagon{

    //private int passengers;
   // private int baggage;
    private static final LevelOfComfort comfort = LevelOfComfort.COUPE;

    public Compartment() {
    }

    public Compartment(int passengers, int baggage) {
        super(passengers, baggage);
    }


    @Override
    public  LevelOfComfort getComfort() {
       return comfort;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public int getBaggage() {
        return baggage;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }
}
