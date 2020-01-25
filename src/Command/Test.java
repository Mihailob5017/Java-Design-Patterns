package Command;
/*
    TIP: Dijagram Ponasanja

    RAZLOG: Zahtev se ubacuje u objekat kao komanda koja se prosledjuje dugom objektu koji moze da je pozove po potrebi

    IMPLEMENTACIJA: Pravimo daljinac kome mogu da se dodaju komande koje se aktiviraju po pozivu na poziv neke funkcije
    tog daljinca.Radi otprilike ko event listener,samo kao
 */
public class Test {
    public static void main(String[] args) {
            Remote remote=new Remote();


            Light light=new Light();
            Stereo stereo=new Stereo();
        remote.setSlot(new LightCommand(light));
        remote.pressButton();
        remote.setSlot(new StereoOffCommand(stereo));
        remote.pressButton();

    }
}
