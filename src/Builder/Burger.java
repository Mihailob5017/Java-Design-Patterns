package Builder;

public class Burger implements Item {
    @Override
    public void name() {
        System.out.println("Burger");
    }

    @Override
    public double price() {
        System.out.println("Price: 2.00$");
        return 2;
    }

    @Override
    public void wrapping() {
        Wrapping wrapping=new Box();
        wrapping.type();
        wrapping.wrap();
    }
}
