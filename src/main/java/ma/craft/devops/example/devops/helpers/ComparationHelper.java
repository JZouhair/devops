package ma.craft.devops.example.devops.helpers;

public class ComparationHelper {

    public static boolean compareLongs(long a, long b){
        if(a == b){
            return true;
        }
        return false;
    }


    public static boolean isHello(String anyString){
        return anyString.equals("Hello");
    }
}
