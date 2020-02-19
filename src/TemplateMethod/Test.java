package TemplateMethod;

/*
    TIP:Dijagram Ponasanja

    RAZLOG:Imamo vise klasa koje koriste metodu koja je slicna ali ima neke sitnicie koje se razlikuju i koje po defaultu
    se menjaju

    IMPLEMENTACIJA: Za konkretan primer koristimo abstractnu klasu HouseBuilder koja ima metodu .build(),ta metoda ne moze
    da se menja ali mogu da se ubacuju i izbacuju metode pozvane u toj metodi pomcu hooks-a.
 */
public class Test {
    public static void main(String[] args) {
            PlainHouse houseWithGarden=new HouseWithGarden();
            PlainHouse houseWithGarage=new HouseWithGarage();
            houseWithGarage.BuildAHouse();
            houseWithGarden.BuildAHouse();
    }
}
