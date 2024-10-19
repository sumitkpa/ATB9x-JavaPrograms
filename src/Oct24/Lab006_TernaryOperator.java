package Oct24;

public class Lab006_TernaryOperator {
    public static void main(String[] args) {

        //Ternary Operator
        int age = 19;
        String vote = age>18 ? "Allowed to vote" : "Not Allowed to Vote";
        System.out.println(vote);

        //Nested Ternary Operator
        int a=10, b=200, c=25;

        String result = a>b ? "A is greater" : (b>c ? "B is greater" : "C is greater");
        System.out.println(result);
    }
}
