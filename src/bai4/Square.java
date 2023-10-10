package bai4;

public class Square extends Rectangle{

   public Square(double side){
       super(side,side);
   }
   public Square(){

   }

    public Square(double side,String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
       return getWith();
    }

    public void setSide(double side){
       setWith(side);
       setLength(side);
    }

    @Override
    public void setWith(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Square " +getSide() + "which is a subclass " +super.toString();
    }
}
