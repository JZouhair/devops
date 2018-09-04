package ma.craft.devops.example.devops.helpers;

public class ComparationHelper {

    private ComparationHelper(){}

    public static boolean compareLongs(long a, long b){
        return a == b;
    }

    public static boolean isHello(String anyString){
        return anyString.equals("Hello");
    }

    public static String concatenateHelloWith(String value){
        return value == null ?  "Hello" : "Hello"+value;
    }
}
