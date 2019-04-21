package com.company.model;

public abstract class  Locomotive implements Wagon {

    int trainTeam;
    LevelOfComfort comfort = LevelOfComfort.LOCOMOTIVE;
    public LevelOfComfort getComfort(){
      return this.comfort;
    };


}
