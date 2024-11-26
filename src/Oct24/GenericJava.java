package Oct24;

public class GenericJava {


    public static <DT> DT gmethod (DT a) {

        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {

        gmethod(a:5);
        gmethod(a:"Sumit");


    }
}
