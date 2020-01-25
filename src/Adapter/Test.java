package Adapter;

/*
    TIP: Strukturni Dijagram

    RAZLOG: Ako neke klase koriste nekompatabline interfejse, Koristimo adatper patern da bi omogucili saradnju tih
    paterna

    IMPLEMENTACIJA: Recimo da imamo dve klase koje trebaju da implementiraju isti interfes.Medjutim jedna od tih klasa
    kompatabilna sa odredjenim interfejstom,koristimo adapter klasu koja implementira dati interfejs i pozivom na njega
    poziva funkciju koja zamenjuje taj interfejst
 */
public class Test {
    public static void main(String[] args) {
        Interfejs klasa1 = new KompKlasa1();
        Interfejs klasa2 = new KompKlasa2();
        //Ovo ne bi radilo
        // Interfejs klasa3=new NeKompKlasa();
        NeKompKlasa neRadi = new NeKompKlasa();
        Adapter adapterKlasa = new Adapter(neRadi);
        klasa1.nekaFunkcija();
        klasa2.nekaFunkcija();
        adapterKlasa.nekaFunkcija();


    }
}
