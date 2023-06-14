package CricketGameInterfaceSegregationPrinciple.model;

import CricketGameInterfaceSegregationPrinciple.Interface.Bat;
import CricketGameInterfaceSegregationPrinciple.Interface.Field;

public class PureBatsmen implements Bat, Field {
    private String name;

    public PureBatsmen(String name){ this.name = name; }

    @Override
    public String bat() {
        return (this.name+" is a pure batsmen");
    }

    @Override
    public String field() {
        return (this.name+" is a pure batsmen fielding");
    }
}
