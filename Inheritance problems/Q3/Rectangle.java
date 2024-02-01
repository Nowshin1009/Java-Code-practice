package HW2.Q3;

public class Rectangle extends Shape {
   public void getArea(){
    System.out.println("Rectangle has an area");
   } 

   public static void main(String[] args) {
    Shape s=new Shape();
    Rectangle r=new Rectangle();

    s.getArea();
    r.getArea();
   }
}
