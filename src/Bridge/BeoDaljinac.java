package Bridge;

public class BeoDaljinac extends Daljinac {
    public BeoDaljinac(Most most) {
        super(most);
    }

    public void useBlueButtonToTurnOn() {
        this.turnOn();
        System.out.println("Upaleno preko belog daljinca");
    }

    public void useBlueButtonToTurnOff() {
        this.turnOff();
        System.out.println("Ugaseno preko belog daljinca");
    }
}
