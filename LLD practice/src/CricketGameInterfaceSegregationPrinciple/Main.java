package CricketGameInterfaceSegregationPrinciple;

import CricketGameInterfaceSegregationPrinciple.Interface.Bat;
import CricketGameInterfaceSegregationPrinciple.Interface.Bowl;
import CricketGameInterfaceSegregationPrinciple.Interface.Field;
import CricketGameInterfaceSegregationPrinciple.Interface.WicketKeeping;
import CricketGameInterfaceSegregationPrinciple.model.AllRounder;
import CricketGameInterfaceSegregationPrinciple.model.Bowler;
import CricketGameInterfaceSegregationPrinciple.model.PureBatsmen;
import CricketGameInterfaceSegregationPrinciple.model.WicketKeeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PureBatsmen p1=new PureBatsmen("Rohit Sharma");
        PureBatsmen p2=new PureBatsmen("Shubman Gill");
        PureBatsmen p3=new PureBatsmen("Virat Kohli");
        PureBatsmen p4=new PureBatsmen("Surya Kumar yadav");
        WicketKeeper w1=new WicketKeeper("KS Bharat");
        AllRounder a1=new AllRounder("Jadeja");
        AllRounder a2=new AllRounder("Hardik Pandya");
        Bowler b1=new Bowler("Ashwin");
        Bowler b2=new Bowler("Siraj");
        Bowler b3=new Bowler("Shami");
        Bowler b4=new Bowler("Chahal");

        Bat[] batsmenArr={p1,p2,p3,p4,w1,a1,a2};
        Bowl[] bowlerArr={a1,a2,b1,b2,b3,b4};
        Field[] fielderArr={p1,a1,b1};;
        WicketKeeper[] wicketKeepersArr={w1};
        List<Bat> batsmen= Arrays.asList(batsmenArr);
        List<Bowl> bowlers=Arrays.asList(bowlerArr);
        List<Field> fielders=Arrays.asList(fielderArr);
        List<WicketKeeping> wicketKeepers=Arrays.asList(wicketKeepersArr);

        PlayGame playGame=new PlayGame();
        playGame.playersToBat(batsmen);
        System.out.println();
        playGame.playersToBowl(bowlers);
        System.out.println();
        playGame.playersToField(fielders);
        System.out.println();
        playGame.playersToKeepWicket(wicketKeepers);
    }
}
