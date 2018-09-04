package ma.craft.devops.example.devops.helpers;

public class ComparationHelper {

    private ComparationHelper(){}

    public static boolean compareLongs(long a, long b){
        return a == b;
    }


    public static boolean isHello(String anyString){
        return "Hello".equals(anyString);
    }
}
