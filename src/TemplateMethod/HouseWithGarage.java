package TemplateMethod;

public class HouseWithGarage extends PlainHouse {
    @Override
    boolean userWantsGarage() {
        return true;
    }

    @Override
    void addWalls() {
        System.out.println("Added some Soft Walls");
    }
}
