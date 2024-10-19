package Oct24;

public class Lab005_TypeCasting {
    public static void main(String[] args) {

        //Type casting - Implicit and Explicit type casting

    //Widening - Implicit - converting small data type into large data type.
        int a = 10;
        float b = a; //Implicit

        System.out.println("Implicit: "+b);

    //Narrowing - Explicit - converting large data type into small data type.
        byte c =25;
        int d = (byte) c; //Explicit

        float e = 2.25f;
        int f = (int) e;

        System.out.println("Explicit:"+d+"\n"+f);

    }
}
