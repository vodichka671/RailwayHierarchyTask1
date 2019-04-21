package com.company.model;

public interface Wagon {
enum LevelOfComfort {
    LOCOMOTIVE, OPEN_TYPE, COUPE, VIP
}
    LevelOfComfort getComfort();
}
