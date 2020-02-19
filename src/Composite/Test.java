package Composite;

import java.util.ArrayList;

/*
        TIP:Strukturni Dijagram

        RAZLOG:Nek ti asocijacija na ovo bude direktorijum.Imamo jednu veliku komponentu koja je sacicnjena iz manjih
        komponenti koje su sacinjene iz manjih komponenti al takodje ne moraju biti.Kao neka hierarhija

        IMPLEMENTACIJA:Implementriacemo kao hierarhija zaposlenih.Svakih od zaposlenih mzoe da ima podzaposlengo a i ne mora

 */
public class Test {
    public static void main(String[] args) {
        Employe CEO = new Employe("Joe Johnosn", "CEO", 10000, new ArrayList<>());
        Employe CTO = new Employe("Mark Gonnard", "CTO", 75000, new ArrayList<>());
        Employe COO = new Employe("Ivan Drago", "COO", 67000, new ArrayList<>());

        CEO.addSub(CTO);
        CEO.addSub(COO);


        CTO.addSub(new Employe("Johnny Depp", "Cleaning", 50000, null));
        CTO.addSub(new Employe("Johnny Maniac", "Actor", 45000, null));
        CTO.addSub(new Employe("Johnny Sins","Cleaning",35000,null));

        COO.addSub(new Employe("Sally Smith","Porn",50000,null));
        COO.addSub(new Employe("Mila Kunis","Actress",55000,null));

        CEO.getInfo();




    }
}
