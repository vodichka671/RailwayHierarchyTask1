package com.company.model;

public abstract class PassengerWagon implements Wagon {
    protected int passengers;
    protected  int baggage;



    @Override
    public String toString() {
        return ""+getComfort() + getPassengers()+getBaggage() ;
    }
    public boolean checkLimit(int people, int peopleLimit, int baggage){
        if (baggage<=0||people<=0){
            return false;
        }
        return people<=peopleLimit?true:false;
    }
    }

