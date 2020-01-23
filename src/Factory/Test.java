package Factory;

/*
    TIP: Gradivni Dijagram

    RALOG: Koriscenjem ovog Dijagrama zaobilazimo koriscenje reci manuelnog instaciranja korisecnjem reci new.
    Vec koristimo facotry klasu koja nam dozvoljava da dinamicno instanciramo razlicite klase.

    IMPLEMENTACIJA:Imamo n>1 klasa koje implementiraju isti interfejs sa odredjenim metodama,ali
    razlictim vrednostima.Takodje imamo klasu Factory sa metodom koja nam vraca izabranu klasu
 */


public class Test {
    public static void main(String[] args) {
       Interfejs objekat=Factory.getObjekat("ob1");
       Interfejs objekat2=Factory.getObjekat("ob2");
       objekat.metoda1();
       objekat2.metoda2();
    }
}
