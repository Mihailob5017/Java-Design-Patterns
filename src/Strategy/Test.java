package Strategy;

/*
    TIP: Dijagram Ponasanja

    RAZLOG: Ovaj patern u zavistnosti od konteksta moze u toku izvrsavanja da promeni trenutni algoritam koji se
    izvrsava

    IMPLEMENTACIJA:

 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.setBarkBehaviour(new AngryBark());
        dog.bark();

    }
}
