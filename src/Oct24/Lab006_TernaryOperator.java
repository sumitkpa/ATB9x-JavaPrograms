package Oct24;

public class Lab006_TernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator
        int age = 19;
        String vote = age>18 ? "Allowed to vote" : "Not Allowed to Vote";
        System.out.println(vote);

        //Nested Ternary Operator
        int a=100, b=20, c=250;

        String result = (a>b && a>c) ? "A is greater" : (b>c ? "B is greater" : "C is greater");
        System.out.println(result);

    }
}
