package bai4;

public class Main {
    public static void main(String[] args) {
        //kiem thu shape
        System.out.println("----------------Shape-----------------");
        Shape shape=new Shape();
        System.out.println(shape);

        shape=new Shape("red",false);
        Shape shape1=new Shape();
        shape1=new Shape("with",true);
        System.out.println(shape1);
        System.out.println(shape);

        //kiem thu Circle
        System.out.println("----------------Circle-----------------");
        Circle circle=new Circle(3.5);
        System.out.println(circle);

        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle("indgo", false, 3.5);
        System.out.println(circle);

        //kiem thu Rectange
        System.out.println("--------------------Rectange---------------------");
        Rectangle rectangle=new Rectangle(2.4,1.6);
        System.out.println(rectangle);

       rectangle=new Rectangle(2.4, 4.9, "red",true);
        System.out.println(rectangle);


        System.out.println("-------------Square-------------------");

        Square square = new Square();
        System.out.println(square);

        Square square1=new Square(2.35);
        System.out.println(square1);

        Square square2=new Square(100,"red",true);
        System.out.println(square2);
    }
}
