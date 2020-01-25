package Prototype;
/*
    TIP: Gradivni Dijagram

    RAZLOG: Zelimo da kloniramo vec postojeci objekat.

    IMPLEMENTACIJA:Ovo implementiramo tako sto imamo zajednicki interfejs koji extenduje Clonable I ima funkciju clone it
    On nam samo vraca kopiju ovoga,koriscenjem obj.clone()
 */
public class Test {

    public static void main(String[] args) {
        Dog dog=new Dog("Lesi","5");
        PrototypeFactory pr=new PrototypeFactory();
        Animal lesiSeVracaKuci=pr.cloneAnimal(dog);
        dog.whoami();
        lesiSeVracaKuci.whoami();
        Animal proba=dog.cloneIt();
        proba.whoami();
    }
}
