package com.company;

import com.company.controller.Controller;
import com.company.model.*;
import com.company.view.View;

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
        Train train = new Train();
        train.add(new CompartmentWagon(5,45));
        train.add(new OpenTypeWagon(45,146));
        train.add(new OpenTypeWagon(5,3));
        train.add(new VipWagon(11,2));
        train.add(new CompartmentWagon(34,123));

        Controller controller = new Controller(train, new View());
        controller.run();





    }
}
