package Adapter;

public class Adapter implements Interfejs {
    private NeKompKlasa klasa;

    public Adapter(NeKompKlasa klasa) {
        this.klasa = klasa;
    }

    @Override
    public void nekaFunkcija() {
        klasa.NekompatabinaFunkcija();
    }
}
