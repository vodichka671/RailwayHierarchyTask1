package com.company.model;

public class OpenTypeWagon extends PassengerWagon {
    private static final LevelOfComfort comfort = LevelOfComfort.OPEN_TYPE;

    public OpenTypeWagon() {
    }

    public OpenTypeWagon(int passengers, int baggage) {
        super(passengers, baggage);
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
