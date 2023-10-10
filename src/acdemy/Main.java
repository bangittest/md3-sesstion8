package acdemy;

public class Main {
    public static void main(String[] args) {
        //khoi tao doi tuong tu 2 lop con
        Car car1=new Car("toyota","black");
        Car car2=new Car("Ford","white");

        //truy cap cac phuong thuc cua lop cha
        System.out.println("car 1 brand is " + car1.getColor());
        car1.setColor("yellow");
        System.out.println(car1.toString());
        car2.setColor("black");
        car2.setBrand("toiiu");
        System.out.println(car2.toString());

        Motorcycle motor1=new Motorcycle("honda","trang");
        Motorcycle motor2=new Motorcycle("way","den");
        motor1.setBrand("pkl");
        System.out.println(motor1);
        System.out.println(motor2);

        System.out.println(motor1.toString());
        System.out.println(motor2.toString());

    }
}
