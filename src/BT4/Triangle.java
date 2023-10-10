package BT4;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        super.toString();
        return "Triangle{" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +","+
                "color=" + getColor() +","+
                "chu vi= " + getPerimeter() +","+
                "dien tich= " + getArea() +
                '}';
    }
}
