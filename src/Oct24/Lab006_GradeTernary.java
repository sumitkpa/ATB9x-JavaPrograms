package Oct24;

import java.util.*;

public class Lab006_GradeTernary {
    public static void main(String[] args) {

        //90 - 100 grade A
        //80 - 89 grade B
        //70 - 79 grade C
        //60 - 69 grade D
        //50 - 59 grade E
        //0 - 49 Fail
        //Input - integer / Output Character grade

        char grade = 'F';
        System.out.println("Enter your score");
        Scanner score = new Scanner(System.in);
        int i = score.nextInt();

        if(i >=90 && i<=100){
            grade = 'A';

        } else if (i>=80 && i<=89) {
            grade = 'B';

        } else if (i>=70 && i<=79) {
            grade = 'C';

        } else if (i>=60 && i<=69) {
            grade = 'D';

        } else if (i>=50 && i<=59) {
            grade = 'E';

        } else if (i>0 && i<=49 ) {
            grade = 'F';

        } else if (i<0 || i>=101) {
            System.out.println("This is invalid input");
        } else {
            grade = 'Z';
            System.out.println("No score found");
        }

        System.out.println("Your Grade is " + grade);

   //     Scanner.close();
    }
}
