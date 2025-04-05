package JavaPrograms;

//Access TestClass from Package Oct24
import Oct24.TestClass;

public class AccessOtherClass extends TestClass {

    public static void main (String[] args)
    {
//Access class under same package
        Scan obj = new Scan();
        obj.inputText();

//Access class under Oct24 package
        TestClass obj2 = new TestClass();
        obj2.inputText();

    }
}
