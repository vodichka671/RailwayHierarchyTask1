package com.company;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        //System.out.println(TrainTeam.ONE.ordinal());
        List<Wagon> list = new ArrayList<>();

        list.add(new Compartment());
        list.add(new Locomotive());
        list.add(new OpenTypeWagon(5,3));
        list.add(new VipWagon(1,2));
        for (Wagon i: list
             ) {
            System.out.println(i);
        }


    }
}
