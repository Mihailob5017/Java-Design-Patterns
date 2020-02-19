package State;

public class SoldOutState implements State {
    GumbalMashine gumbalMashine;

    public SoldOutState(GumbalMashine gumbalMashine) {
        this.gumbalMashine = gumbalMashine;
    }

    @Override
    public void insertQuater() {
        System.out.println("We are sold Out!");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Here is Your Quarter Back,We Are sold Out");
    }

    @Override
    public void turnCrank() {
        System.out.println("No need to turn the crank.We are sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("We dont have any boonboons");
    }
}
