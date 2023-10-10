package BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap x: ");
        double x= Double.parseDouble(scanner.nextLine());

        System.out.println("nhap y: ");
        double y= Double.parseDouble(scanner.nextLine());

        System.out.println("nhap z : ");
        double z= Double.parseDouble(scanner.nextLine());
        Point2D p= new Point2D((float) x, (float) y);
        System.out.println(p.toString());

        Point3D point3D=new Point3D((float) x, (float) y, (float) z);
        System.out.println(point3D.toString());
    }
}
