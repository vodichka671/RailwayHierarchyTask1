package com.company.model;

public class VipWagon extends PassengerWagon {
    private static final LevelOfComfort comfort = LevelOfComfort.VIP;
    private static final int passengerLimit = 11;
    public VipWagon() {
        this.passengers = 0;
        this.baggage = 0;
    }

    public VipWagon (int passengers, int baggage) throws IllegalArgumentException{
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
