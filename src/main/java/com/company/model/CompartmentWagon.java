package com.company.model;

public class CompartmentWagon extends PassengerWagon{

    //private int passengers;
   // private int baggage;
    private static final LevelOfComfort comfort = LevelOfComfort.COUPE;
    private static final int passengerLimit = 36;
    public CompartmentWagon() {
        this.passengers = 0;
        this.baggage = 0;
    }

    public CompartmentWagon(int passengers, int baggage) {
        if (checkLimit(passengers,passengerLimit,baggage)){
            this.passengers = passengers;
            this.baggage = baggage;
        }else {
            throw new IllegalArgumentException();
        }
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
