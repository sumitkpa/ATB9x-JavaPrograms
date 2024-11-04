package Oct24;

public class Lab009_String_Functions {

    public static void main(String[] args) {

    // Substring:
        String s = "Hello World!";
        String result = s.substring(2,7); // (2, 7-1)
        System.out.println(result);

        System.out.println("Humburger".substring(4, 8));
        System.out.println("Smile".substring(2, 4));

    // Concatenation (By +)
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = " Testing";
        String result2 = s1 + s2 + s3; // Creates a new string "Hello World!"
        System.out.println(result2); // Output: Hello World!




    }
}
