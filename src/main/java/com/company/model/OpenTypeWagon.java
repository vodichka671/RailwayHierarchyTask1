package com.company.model;

public class OpenTypeWagon extends PassengerWagon {
    private static final LevelOfComfort comfort = LevelOfComfort.OPEN_TYPE;
    private static final int passengerLimit = 54;
    public OpenTypeWagon() {
        this.passengers = 0;
        this.baggage = 0;
    }

    public OpenTypeWagon(int passengers, int baggage) {
        if (checkLimit(passengers,passengerLimit,baggage)){
            this.passengers = passengers;
            this.baggage = baggage;
        }else {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public LevelOfComfort getComfort() {
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
