package Strategy;

public class ProteinDiet implements EatBehaviour {
    @Override
    public void eat() {
        System.out.println("Eating only protein filled food");
    }
}
