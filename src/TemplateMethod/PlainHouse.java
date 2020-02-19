package TemplateMethod;

public abstract class PlainHouse {
//     IMMUTABLE METHODS
    final void BuildAHouse(){
        addConcreteFloor();
        addWalls();
        if(userWantsGarage())
            addGarage();
        addRoof();
        if(userWantsGarden())
            addGarage();


        System.out.println("House is Done ");
        System.out.println("________________________");
    }
    final void addConcreteFloor(){
        System.out.println("Added the floor");
    }

    final void addRoof(){
        System.out.println("Added the Roof");
    }



//    HOOKS

    boolean userWantsGarage(){return false;}
    boolean userWantsGarden(){return false;}


//  MUTTABLE METHODS
    void addWalls(){
        System.out.println("Added some hard walls");
    }
    void addGarage(){
        System.out.println("Added A Garage");
    }
    void addGarden(){
        System.out.println("Added the Garden");
    }
}
