package TemplateMethod;

public class HouseWithGarden extends  PlainHouse {
    @Override
    boolean userWantsGarden() {
        return true;
    }

    @Override
    void addWalls() {
        System.out.println("Added some nicy hard Walls");
    }
}
