package Bridge;

public class CrnDaljinac extends Daljinac {

    public CrnDaljinac(Most most) {
        super(most);
    }
    public void useRedButtonToTurnOn(){
        this.turnOn();
        System.out.println("Upaljeno preko crnog daljinca");
    }
    public void useRedButtonToTurnOff(){
        this.turnOff();
        System.out.println("Ugaseno preko crnog daljinca ");
    }
}
