package Builder;

public class Coke implements Item{
    @Override
    public void name() {
        System.out.println("Coca Cola");
    }

    @Override
    public double price() {
        System.out.println("Price: 1.00$");
        return 1;
    }

    @Override
    public void wrapping() {
       Wrapping wrapping=new Bottle();
       wrapping.type();
       wrapping.wrap();
    }
}
