package com.company;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


        Train train = new Train();
        train.add(new CompartmentWagon(5,45));

        train.add(new OpenTypeWagon(5,3));
        train.add(new VipWagon(11,2));
        train.add(new CompartmentWagon());

        train.sort();
        ArrayList<Wagon> w = train.findWagons(3,11);

        for (Wagon i:w
             ) {
            System.out.println(i);
        }





    }
}
