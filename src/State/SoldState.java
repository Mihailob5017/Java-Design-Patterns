package State;

public class SoldState implements  State{
    GumbalMashine gumbalMashine;

    public SoldState(GumbalMashine gumbalMashine) {
        this.gumbalMashine = gumbalMashine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Only one purchase per coin!");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Cant do that,we Already sold you");
    }

    @Override
    public void turnCrank() {
        System.out.println("U can get only one");
    }

    @Override
    public void dispense() {
        System.out.println("Enjoy ur food");
    }
}
