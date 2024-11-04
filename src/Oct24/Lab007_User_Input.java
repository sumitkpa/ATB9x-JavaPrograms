package Oct24;

import java.util.*;

public class Lab007_User_Input {

    public static void main(String[] args) {

        System.out.println("Enter Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Enter Age");
        Scanner scanner1 = new Scanner(System.in);
        int age = scanner1.nextInt();

        System.out.println("Enter Salary");
        Scanner scanner2 = new Scanner(System.in);
        float salary = scanner2.nextFloat();

        System.out.printf("Your Name is %s \nYour Age is %d \nYour Salary is %f" , name , age, salary);

    }
}
