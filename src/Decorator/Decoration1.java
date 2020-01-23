package Decorator;

public class Decoration1 extends ComponentDecorator {
    RootComponent root;

    public Decoration1(RootComponent root) {
        this.root = root;
    }

    @Override
    public int getPrice() {
     return   root.getPrice()+25;
    }
}
