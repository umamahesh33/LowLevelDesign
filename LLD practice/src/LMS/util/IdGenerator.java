package LMS.util;

public class IdGenerator {
    private static long count;
    private IdGenerator(){ count=0; };
    public static long getUniqueId(){
        return count++;
    }
}
