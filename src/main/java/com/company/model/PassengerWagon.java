package com.company.model;

public abstract class PassengerWagon implements Wagon {
    protected int passengers;
    protected  int baggage;



    @Override
    public String toString() {
        return "Wagon Type : "+getComfort() +"\n"+"Amount of passengers : "+ getPassengers()+ "\n"+ "Amount of baggage : " + getBaggage() ;
    }
    public boolean checkLimit(int people, int peopleLimit, int baggage){
        if (baggage<=0||people<=0){
            return false;
        }
        return people<=peopleLimit?true:false;
    }
    }

