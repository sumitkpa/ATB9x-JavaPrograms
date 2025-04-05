package JavaPrograms;

public class Inheritance {

    public static void main(String[] args) {

     // calling both class with same object
        B obj = new B();
        obj.showB();
        obj.showA();

        Const obj2 = new Const("John",20);


    }

}

class A
{
    void showA()
    {
        System.out.println("This is class A");
    }
}

// Class B Inherit class A
class B extends A
{
    void showB()
    {
        System.out.println("This is class B");
    }
}

// Creating constructor and
class Const
{
    String name;
    int age;

    public Const(String name, int age)
    {
        this.name = name;
        this.age = age;

        System.out.println(name + " " + age);
    }
}
