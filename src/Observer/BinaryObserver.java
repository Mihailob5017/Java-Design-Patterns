package Observer;

public class BinaryObserver extends Observer {
    @Override
    public void update(int newValue) {

        System.out.println("Binary value: "+ Integer.toBinaryString(newValue));
    }
}
