package com.company.model;

public interface Wagon {
enum LevelOfComfort {
    LOCOMOTIVE, OPEN_TYPE, COMPARTMENT, VIP
}
    LevelOfComfort getComfort();
    int getPassengers();
    int getBaggage();

}
