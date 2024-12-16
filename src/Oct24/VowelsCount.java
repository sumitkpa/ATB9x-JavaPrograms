package Oct24;

import java.util.*;

//Find the Vowels in the given name
public class VowelsCount {

    public static void main(String[] args) {
        //Taking user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String n1 = s.nextLine();
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
        System.out.println(charList.size() + " " + charList);

        // Print the character counts
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : charList) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : count.keySet()) {
            System.out.println(c + " : " + count.get(c));
        }

    }
}

