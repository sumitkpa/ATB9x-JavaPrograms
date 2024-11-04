package Oct24;

public class Lab008_Strings {
    public static void main(String[] args) {
    // Tow ways to create String
        //Using = operator
        String name = "Sumit";
        System.out.println(name);

        //Using new operator
        String name2 = new String("Sumit");
        System.out.println(name2);

    // COMBINES TWO STRINGS

        // Concatenation (By +)
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!

        // Concatenation (By str)
        String s4 = "Pramod";
        String s5 = s4.concat("Dutta");
        System.out.println(s5);

        //Append
        StringBuilder s6 = new StringBuilder("Sumit");
        s6.append("Pandit"); //Modifies s6 to HelloWorld
        System.out.println(s6.toString());

    }
}
