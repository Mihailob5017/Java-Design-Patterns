package State;

public class Test {
    /*
    TIP: Dijagaram Ponasanja

    RAZLOG: Kreiramo objekte cije se metode/attributi menjaju na osnovu intenrog stanja tog objekta

    IMPLEMENTACIJA: Ideja je da napravimo Univerzalni state interfejs koji ima sve akcije koje izvrasavamo
     i da implementiramo napravimo klase koje bi bile varijacije toga.Onda da svaku klasu ubacimo kao atribut i da ih
     menjamo interno po metodama.
     */
    public static void main(String[] args) {
        GumbalMashine gmbl = new GumbalMashine(10);
        //Get The Bona
        gmbl.inserQuater();
        gmbl.turnCrank();
        System.out.println("------------");
        //No money
        gmbl.inserQuater();
        gmbl.ejectQuater();
        gmbl.turnCrank();
        System.out.println("-----------");
        //No money pt 2
        gmbl.turnCrank();
        gmbl.dispense();

    }
}
