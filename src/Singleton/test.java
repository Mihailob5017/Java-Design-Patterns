package Singleton;
 /*
    TIP: Gradivni patern

    RALOG: Omogucava nam da imamo jednu instancu klase i da mozemo globalno da joj pristupimo.

    IMPLEMENTACIJA: Ovu klasu implementiramo tako sto imamo privatni konstkrutkor koji se moze pozvati iz staticne
    metode.Ta metoda provera da li vec postoji istanca ove klase,i ako ne postoji poziva konstruktor,a ako postoji onda
    vraca "null".
  */

public class test {
    public static void main(String[] args) {
            Singleton test=Singleton.createSingleton();
            Singleton drugiTest=Singleton.createSingleton();


    }
}
