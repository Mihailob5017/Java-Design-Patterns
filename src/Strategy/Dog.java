package Strategy;

public class Dog {
        EatBehaviour eatBehaviour;
        BarkBehaviour barkBehaviour;

    public Dog() {
        eatBehaviour=new NormalDiet();
        barkBehaviour=new NormalBark();
    }

    public void setEatBehaviour(EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }

    public void setBarkBehaviour(BarkBehaviour barkBehaviour) {
        this.barkBehaviour = barkBehaviour;
    }
    public void eat(){
        eatBehaviour.eat();
    }
    public void bark(){
        barkBehaviour.bark();
    }
}
