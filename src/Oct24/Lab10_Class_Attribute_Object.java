package Oct24;

public class Lab10_Class_Attribute_Object {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name = "Promod"; // creating object and assigned value
        c1.Sleep(); // calling function
        System.out.println(c1.name);


    }
}

// CAB  - Class - Attribute - Object
class Cat{  //class creation
    String name;    // attribute


        void Sleep (){  // object
            System.out.println("sleeping");
        }
}


