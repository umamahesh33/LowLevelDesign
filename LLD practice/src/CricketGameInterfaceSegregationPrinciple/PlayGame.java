package CricketGameInterfaceSegregationPrinciple;

import CricketGameInterfaceSegregationPrinciple.Interface.Bat;
import CricketGameInterfaceSegregationPrinciple.Interface.Bowl;
import CricketGameInterfaceSegregationPrinciple.Interface.Field;
import CricketGameInterfaceSegregationPrinciple.Interface.WicketKeeping;

import java.util.List;

public class PlayGame {
    public void playersToBat(List<Bat> batters){
        for(Bat batsmen: batters){
            System.out.println(batsmen.bat());
        }
    }

    public void playersToBowl(List<Bowl> bowlers){
        for(Bowl bowler: bowlers){
            System.out.println(bowler.bowl());
        }
    }

    public void playersToField(List<Field> fielders){
        for(Field fielder: fielders){
            System.out.println(fielder.field());
        }
    }

    public void playersToKeepWicket(List<WicketKeeping> keepers){
        for(WicketKeeping keeper: keepers){
            System.out.println(keeper.keepWicket());
        }
    }
}
