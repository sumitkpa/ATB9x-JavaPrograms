package Oct24;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //  String myStr = "sumit pandit";
        // char[] myArray = myStr.toCharArray();
        // System.out.println(myArray[10]);

        String n1 = "Neha Pandit";
        //String to lower case
        n1 = n1.toLowerCase();
        System.out.println("The given name in lower case is: ");
        //String to Array
        char[] name = (n1.toCharArray());
        System.out.println(name);
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            String n2 = "aeiou";
            char[] v = n2.toCharArray();

            for (int j = 0; j < v.length; j++) {
                if (v[j] == name[i]) {
                    // System.out.print(name[i]);
                    charList.add(name[i]);

                }

            }
        }
        System.out.println(charList.size() + "(" + charList + ")");

    }
}

