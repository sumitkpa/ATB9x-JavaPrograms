package Oct24;

public class GenericJava {

// calling Generic Method (which helps to print variables without declaring data type
    public static void main(String[] args) {

        gmethod(5);
        gmethod('S');
        gmethod("Sumit");
        gmethod(51.50);

    }

// Create Generic Method + using return type void
    public static <DT> void gmethod (DT a) {

        System.out.println(a);

    }
}
