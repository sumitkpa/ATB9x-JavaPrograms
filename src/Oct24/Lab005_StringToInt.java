package Oct24;


public class Lab005_StringToInt {

    public static void main(String[] args) {

        String a = "30";
        System.out.println("String = "+a);
        System.out.println("Checking the data type = " + ((Object)a).getClass().getSimpleName());

    //Rule to convert Sting to Integer
        int i = Integer.parseInt(a);
        System.out.println("String converted to Integer = "+i);
        System.out.println("Checking data type = " + ((Object)i).getClass().getSimpleName());

    }
}
