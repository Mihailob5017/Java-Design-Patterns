package Builder;

public class Box implements Wrapping {
    @Override
    public void type() {
        System.out.println("Box type Wrapping!");
    }

    @Override
    public void wrap() {
        System.out.println("The meal is box wrapped!");
    }
}
