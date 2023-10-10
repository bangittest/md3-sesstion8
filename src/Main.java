import login.imployee.Student;
import login.imployee.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Animal animal=new Animal("Pig");
//        Dog dog=new Dog("Becgie","black");
//        Dog dog1=new Dog("Pug","white");
//        Cat cat=new Cat("Dora");
//
//        System.out.println("animal name is " + animal.getName());
//        animal.setName("Bird");
//        System.out.println("animal name is " + animal.getName());
//
//        //truy cap phuong thuc ke thua lop cha
//        dog1.setName("Corgi");
//        System.out.println("Name : "+dog.getName());
//        System.out.println("Sound : "+dog.makeSound());
//        System.out.println("Color : "+dog1.getColor());
//        System.out.println("Sound : "+dog1.makeSound());
//        System.out.println("Name : "+cat.getName());
//        System.out.println("Sound :"+cat.makeSound());

//        Car sportCar=new SportCar();
//        SportCar sportCar=new SportCar();
//        System.out.println(sportCar);
//        SportCar sportCar=new SportCar("blue");
//        System.out.println(sportCar);

        User student=new Student("123","bang1122","1234","Văn");
        Scanner scanner=new Scanner(System.in);
        boolean islogin=false;
        while (!islogin){
            System.out.println("Login");
            System.out.println("Tài khoản");
            String username=scanner.nextLine();
            System.out.println("Mật khẩu");
            String password=scanner.nextLine();
            if (student.login(username, password)){
                student.displayData();
                return;
            }
        }


    }
}
