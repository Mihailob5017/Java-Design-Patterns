package Facade;

/*
    TIP:Strukturni Patern

    RAZLOG:Pravimo klasu koja nam pomaze da uprosti rad sa ostalim klasama,gde korisinik ne mora da pamti kako se izvrsava
    proces

    IMPLEMENTACIJA:Implementacija ovoga se vrsi tako sto napravimo interfejs kojim povezujemo klase,onda te klase stavljamo
    u jos jednu klasu sa kojom ce korisnik interactovati.Prednsot toga je sto kada korisnik pozove, neku metodu.Ta metoda
    moze da izvrsi sve funkcije (behind the scenes) i da korisniku vrati samo ono sto je potrebno.
 */
public class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawTriangle();
    }
}
