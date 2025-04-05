package JavaPrograms;

public class Constructor {
    String name;
    int age;
    public Constructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args){
        Constructor obj = new Constructor("John",10);
        obj.display();
    }

}
