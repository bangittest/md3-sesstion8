package ra;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound(){
        return "Meo Meo";
    }
}
