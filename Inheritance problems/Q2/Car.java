package HW2.Q2;

public class Car extends Vehicle{
   public void drive(){
    System.out.println("Drive method of Car class!");
   } 
   public static void main(String[] args) {
    Vehicle train=new Vehicle();
    Car Volvo=new Car();

    Volvo.drive();
    train.drive();
   }
}
