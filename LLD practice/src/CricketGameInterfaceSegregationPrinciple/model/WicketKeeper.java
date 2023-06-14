package CricketGameInterfaceSegregationPrinciple.model;

import CricketGameInterfaceSegregationPrinciple.Interface.Bat;
import CricketGameInterfaceSegregationPrinciple.Interface.WicketKeeping;

import java.util.Base64;

public class WicketKeeper implements Bat, WicketKeeping {
    private String name;

    public WicketKeeper(String name){ this.name = name; }


    @Override
    public String bat() {
        return (this.name+" is wicket keeper batting");
    }

    @Override
    public String keepWicket() {
        return (this.name+" is keeping wicket");
    }
}
