package Bridge;

public class SamsungTV implements Most {
    public void BrojKanala(){
        System.out.println("This tv has 100 channels");
    }
    @Override
    public void on() {
        System.out.println("Samsung is ON");
    }

    @Override
    public void off() {
        System.out.println("Samsung is OFF");
    }
}
