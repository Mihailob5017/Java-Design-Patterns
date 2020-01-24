package Builder;

public class Fries implements Item {
    @Override
    public void name() {
        System.out.println("French Fries");
    }

    @Override
    public double price() {
        System.out.println("Price: 1.50$");
        return 1.5;
    }

    @Override
    public void wrapping() {
        Wrapping wrapping=new Box();
        wrapping.type();
        wrapping.wrap();
    }
}
