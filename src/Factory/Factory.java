package Factory;

public class Factory {
   public static Interfejs getObjekat(String ime){
       if(ime.equals("ob1"))
        return new Objekat1();
       else if(ime.equals("ob2"))
        return new Objekat2();
       return null;
    }
}
