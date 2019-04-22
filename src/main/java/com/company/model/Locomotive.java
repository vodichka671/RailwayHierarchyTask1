package com.company.model;

public class  Locomotive implements Wagon {



   private static final LevelOfComfort comfort = LevelOfComfort.LOCOMOTIVE;

    public LevelOfComfort getComfort(){
      return Locomotive.comfort;
    }
    @Override
    public int getPassengers() {
        return 0;
    }

    @Override
    public int getBaggage() {
        return 0;
    }

    @Override
    public String toString() {
        return comfort.toString();
    }
}
