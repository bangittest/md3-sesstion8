package BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap mau : ");
        String color= scanner.nextLine();

        System.out.println("nhap side1 : ");
        double side1= Double.parseDouble(scanner.nextLine());
        System.out.println("nhap side2 : ");
        double side2= Double.parseDouble(scanner.nextLine());
        System.out.println("nhap side3 : ");
        double side3= Double.parseDouble(scanner.nextLine());

        Triangle triangle= new Triangle(color,side1,side2,side3);
        System.out.println(triangle.toString());
        System.out.println(triangle.getSide1());
    }
}
