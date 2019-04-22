package com.company.controller;

import com.company.model.Train;
import com.company.view.View;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    Train train;
    View view;
    Scanner sc = new Scanner(System.in);
    ResourceBundle bundle;
    public static final String resource = "com.company.menu";

    public Controller(Train train, View view) {
        this.train = train;
        this.view = view;
    }
    public Locale chooseLocale(){
        Locale locale = new Locale("en","US");
        bundle = ResourceBundle.getBundle(resource,locale);
        //  System.out.println(bundle.getLocale());


        boolean flag = false;
        do{
            view.showMessage(bundle.getString(PropertiesConstants.CHOOSE_LOCALE));
            while (!sc.hasNextInt()){
                view.showMessage(bundle.getString(PropertiesConstants.ERROR_INPUT));
                sc.next();
            }
            int index = sc.nextInt();
            switch (index){
                case 0: locale = new Locale("en","US") ;
                    flag = true;
                    break;
                case 1: locale = new Locale("ru","RU");
                    flag = true;
                    break;
                case 2: flag = true;
                    locale = Locale.getDefault();
                    break;
                default:
                    //flag = true;
                    view.showMessage(bundle.getString(PropertiesConstants.ERROR_INPUT));
                    break;
            }
        }while (!flag);

        //  index = sc.nextInt();

        return locale;
    }

    public void run(){
        bundle = ResourceBundle.getBundle(resource,chooseLocale());
        boolean flag = true;
      while(flag){
          view.showMessage(bundle.getString(PropertiesConstants.SORT)+"\n"+bundle.getString(PropertiesConstants.FIND_WAGONS));
          while (!sc.hasNextInt()){
              view.showMessage(PropertiesConstants.ERROR_INPUT);
              sc.next();
          }
          int input = sc.nextInt();
          switch (input){
              case 1: train.sort();
                        view.showMessage(train.toString());
                        break;
              case 2: view.showMessage(train.findWagons(12,34).toString());
                        break;
              case 3: flag =false;
                        break;
              default: flag = false;
          }

      }



    }
}
