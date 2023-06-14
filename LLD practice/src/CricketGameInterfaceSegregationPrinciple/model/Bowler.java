package CricketGameInterfaceSegregationPrinciple.model;

import CricketGameInterfaceSegregationPrinciple.Interface.Bowl;
import CricketGameInterfaceSegregationPrinciple.Interface.Field;

public class Bowler implements Bowl, Field {

    private String name;

    public Bowler(String name){
        this.name=name;
    }
    @Override
    public String bowl() {
        return (this.name+" is a pure bowler");
    }

    @Override
    public String field() {
        return (this.name+" is a pure bowler fielding");
    }
}
