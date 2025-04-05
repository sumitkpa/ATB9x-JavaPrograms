package JavaPrograms;
import java.util.*;

public class CallMethod {

    String name;
    int age;

    public static void main (String [] arg) {

        // COM --> CO + OM
        CallMethod obj1 = new CallMethod();
        obj1.dog("Dog",10);
        obj1.result();
        Display obj2 = new Display();
        obj2.result();

    }

    public void result()
    {
        System.out.println(name+"\n"+age);
    }

    public void dog(String a,int b)
    {
        name = a;
        age = b;
    }
}


class Display {
    public void result()
    {
        System.out.println("This is the testing for Method initialization");
    }

}
