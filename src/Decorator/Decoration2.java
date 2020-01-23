package Decorator;

public class Decoration2  extends  ComponentDecorator{
    RootComponent root;

    public Decoration2(RootComponent root) {
        this.root = root;
    }

    @Override
    public int getPrice() {
        return root.getPrice()+50;
    }
}
