package Prototype;

public class PrototypeFactory implements Prototype {
    @Override
    public Animal cloneAnimal(Animal animal) {
        return animal.cloneIt();
    }


}
