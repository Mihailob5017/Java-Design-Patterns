package Decorator;
/*
    TIP: Strukturni patern

    RALOG: Ovaj patern nam dozviljava da prosirimo funkcinalnsot odredjene klase, time sto dodajemo podklase
     i samim tim ubacujemo funkcionalnost tih klasa u nasu originalnu klasu.


    IMPLEMENTACIJA: Imamo jednu glavnu klasu,koja ima svoje odredjenje vrenoosti/metode.Pravimo interfejst/apstrktnu
    klasu Decorator koja se implementira/nasledjuje na klase koje su odabrane kao Decorative-klase.Dekoratoru
    prosledjujemo root componentu objeka.Root komponenta potsaje trenutna komponenta.I tako u krug

 */
public class Test {
    public static void main(String[] args) {
        RootComponent rootComponent=new RootComponent();
        System.out.println("Cena:"+rootComponent.getPrice());
        rootComponent=new Decoration1(rootComponent);
        System.out.println("Cena:"+rootComponent.getPrice());
        rootComponent=new Decoration2(rootComponent);
        System.out.println("Cena:"+rootComponent.getPrice());
    }
}
