package State;

public class HasQuaterState implements  State {
    GumbalMashine gumbalMashine;

    public HasQuaterState(GumbalMashine gumbalMashine) {
        this.gumbalMashine = gumbalMashine;
    }

    @Override
    public void insertQuater() {
        System.out.println("U need to order The Candy");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Quater Ejected");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank Turned");
    }

    @Override
    public void dispense() {
        System.out.println("Take the Candy");
    }
}
