package Builder;

public class Bottle implements Wrapping {
    @Override
    public void type() {
        System.out.println("This is a bottle type");
    }

    @Override
    public void wrap() {
        System.out.println("The juice is poured in the bottle");
    }
}
