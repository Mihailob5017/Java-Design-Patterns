package Bridge;

public abstract class Daljinac  {
    private Most most;

    public Daljinac(Most most) {
        this.most = most;
    }
    public void turnOn(){
        most.on();
    }
    public  void turnOff(){
        most.off();
    }
}
