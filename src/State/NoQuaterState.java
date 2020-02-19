package State;

public class NoQuaterState implements State{
    GumbalMashine gumbalMashine;

    public NoQuaterState(GumbalMashine gumbalMashine) {
        this.gumbalMashine = gumbalMashine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Insert Quater");
    }

    @Override
    public void ejectQuater() {
        System.out.println("We cant Eject if u dont have a quater");
    }

    @Override
    public void turnCrank() {
        System.out.println("U cant do this withous a quater");
    }

    @Override
    public void dispense() {
        System.out.println("No QUater no Candy");
    }
}
