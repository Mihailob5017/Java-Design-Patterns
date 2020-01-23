package Observer;

public class DecimalObserver extends Observer {
    @Override
    public void update(int newValue) {
        System.out.println("Decimal value: "+newValue);
    }
}
