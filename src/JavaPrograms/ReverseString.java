package JavaPrograms;

import java.util.*;

public class ReverseString {
        public static void main(String[] args) {;

            Name obj = new Name();
            //obj.inputText();
            obj.test();

        }
}


class Name extends Scan
{

    public void test()
    {
        inputText();
        String name1 = n;
        char [] a = name1.toCharArray();

        System.out.print("Entered String is: ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.print("\nReversed String is: ");

        for(int i=a.length-1;i>=0; i--)
        {
            System.out.print(a[i]);
        }

    }
}


class Scan
{
    public String n;
    public void inputText()
    {
        Scanner s = new Scanner(System.in);
        System.out.println ("\n Enter String");
        n = s.nextLine();
        System.out.println("This is ReverseSting.java file");
    }
}

