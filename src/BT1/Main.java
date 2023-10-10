package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ban kinh : ");
        double radius= Double.parseDouble(scanner.nextLine());


        System.out.println("nhap mau sac : ");
        String color=scanner.nextLine();

        System.out.println("nhap chieu cao : ");
        double height= Double.parseDouble(scanner.nextLine());

        System.out.println("--------------Circle------------------");
        Circle circle=new Circle(radius,color);
        System.out.println(circle.toString());


        System.out.println("-------------------Cylinder--------------------");
        Cylinder cylinder=new Cylinder(radius,color,height);


        System.out.println(cylinder.toString());
//        System.out.println("radius : " +cylinder.getRadius());
//        System.out.println("height : " +cylinder.getHeight());
//        System.out.println("color : " +cylinder.getColor());
//        System.out.println("volume : " +cylinder.getVolume());


    }
}
