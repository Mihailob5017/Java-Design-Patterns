package Observer;
/*
    TIP: Patern Ponasanja

    RALOG: Jedan objekat je povezan sa vise objekata i oni nadgledaju stanje u njemu.Da u slucaju da se
    pormeni stanje u objektu ne bi morali da menjamo rucno stanja u otalim obojektima.Oni ce automatski
    promeniti svoje stanje kada vide da se promenilo stanje

    IMPLEMENTACIJA: U ovoj metodi imamo tri glvne klase.Subjekat,Observer i Klijent.Subjekat je glavni program
    cije se klase motre i gde mogu da se dodaju i oudzimaju novi observeri.Observer je apstraktna klasa koja
    sluzi da se preko nje pozovu sve ostale klase.
 */
public class Test {
    public static void main(String[] args) {
        Subject test=new Subject();
        test.attachObserver(new BinaryObserver());
        test.attachObserver(new DecimalObserver());
        test.changeValue(25);
        test.changeValue(31);
    }
}
