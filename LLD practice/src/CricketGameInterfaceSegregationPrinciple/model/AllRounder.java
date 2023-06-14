package CricketGameInterfaceSegregationPrinciple.model;

import CricketGameInterfaceSegregationPrinciple.Interface.Bat;
import CricketGameInterfaceSegregationPrinciple.Interface.Bowl;
import CricketGameInterfaceSegregationPrinciple.Interface.Field;

public class AllRounder implements Bat, Bowl, Field {
    private String name;

    public AllRounder(String name){
        this.name=name;
    }
    @Override
    public String bat() {
        return (this.name+" is all rounder batting");
    }

    @Override
    public String bowl() {
        return (this.name+" is all rounder bowling");
    }

    @Override
    public String field() {
        return (this.name+" is all rounder fielding");
    }
}
