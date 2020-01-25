package Bridge;

public class SonyTV implements Most {
    public void brKanala(){
        System.out.println("This has 75 channels");
    }
    @Override
    public void on() {
        System.out.println("Sony is ON");
    }

    @Override
    public void off() {
        System.out.println("Sony is OFF");
    }
}
