package HW2.Q1;

public class Cat extends Animal{
    public void makeSound(){
System.out.println("Cat makes sound!");
    }

    public static void main(String[] args) {
        Animal A=new Animal();
        Cat C=new Cat();

        A.makeSound();
        C.makeSound();
    }
}
