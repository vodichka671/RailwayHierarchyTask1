package com.company.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Train {
    private static int amountOfPassengers;
    private static int amountOfBaggage;
    private List<Wagon> train = new ArrayList<>();
    public Train(){
        train.add(new Locomotive());
    }

    public static int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public static int getAmountOfBaggage() {
        return amountOfBaggage;
    }

    public List<Wagon> getTrain() {
        return train;
    }

    public void add(Wagon E){
        if (E instanceof Locomotive){
            throw new IllegalArgumentException("Cant be two Locomotives in your train");
        }
        amountOfPassengers += E.getPassengers();
        amountOfBaggage += E.getBaggage();
        train.add(E);

    }
    public void sort (){
        Collections.sort(this.getTrain(),(Wagon n,Wagon t)->{
           return n.getComfort().compareTo(t.getComfort()); });
    }

    public ArrayList<Wagon> findWagons(int min,int max){
        ArrayList<Wagon> result = new ArrayList<>();
        for ( Wagon wagon: this.getTrain()
             ) {
            if (wagon.getPassengers()>=min && wagon.getPassengers()<=max ){
                result.add(wagon);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuffer temp = new StringBuffer();
        for (Wagon wagon:this.getTrain()
             ) {
            temp.append(wagon.toString());

        }
        String result = new String(temp);
        return result;
    }
}
