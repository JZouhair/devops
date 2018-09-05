package ma.craft.devops.example.devops.helpers;

public class ComparationHelper {
    private static String hello = "Hello";
    private ComparationHelper(){}

    public static boolean compareLongs(long a, long b){
        return a == b;
    }

    public static boolean isHello(String anyString){
        return anyString.equals(hello);
    }

    public static String concatenateHelloWith(String value){

        return value == null ? hello : hello +value;
    }
}
