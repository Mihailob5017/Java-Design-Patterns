package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Created!");
    }

    public static Singleton createSingleton() {
        if (Singleton.instance != null){
            System.out.println("Singleton Already Exists!");
            return null;
        }

        Singleton.instance = new Singleton();
        return Singleton.instance;
    }
}
