package BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap x:");
        float x= Float.parseFloat(scanner.nextLine());
        System.out.println("nhap y: ");
        float y= Float.parseFloat(scanner.nextLine());

        System.out.println("nhap gia tri cua xSpeed: ");
        float xSpeed= Float.parseFloat(scanner.nextLine());

        System.out.println("nhap gia tri cua ySpeed: ");
        float ySpeed= Float.parseFloat(scanner.nextLine());

        MoveablePoint moveablePoint=new MoveablePoint(x,y,xSpeed, ySpeed);
        System.out.println("movablePoint" + moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
