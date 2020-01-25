package Strategy;

public class NormalDiet  implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("Eating Normaly!");
    }
}
