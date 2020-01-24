package Builder;
/*
    TIP: Strukturni Dijagram

    RALOG: Razdvajamo objekat od njegove konstrukcije, korak po korak sklapamo manje objekate i nadodajeo ih
    i na taj nacin gradimo jedan veci objekat.

    IMPLEMENTACIJA: Prvo pravimo interfejse manjih objekata, zatim povezujemo te manje objekate u vece objekte,zatim
    vece objekte povezujemo u jos vece objekte dok ne dobijemo jedan finalan poslednji objekat.
 */
public class Test {
    public static void main(String[] args) {
            Meal meal=new Meal("mealid1");
            meal.addItem(new Burger());
            meal.addItem(new Burger());
            meal.addItem(new Fries());
            meal.addItem(new Coke());
            meal.whatIOrdered();
            meal.getPrice();
    }
}
