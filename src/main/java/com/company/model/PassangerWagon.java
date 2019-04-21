package com.company.model;

public abstract class PassangerWagon implements Wagon{
    protected LevelOfComfort comfort;
    @Override
    public LevelOfComfort getComfort() {
        return this.comfort;
    }
}
