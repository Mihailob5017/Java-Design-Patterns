package Decorator;

public class Decoration2  extends  ComponentDecorator{
    RootComponent root;

    public Decoration2(RootComponent root) {
        this.root = root;
        System.out.println("Deocation 2");
    }

    @Override
    public int getPrice() {
        return root.getPrice()+50;
    }
}
