package Prototype;

public class Cat implements Animal{
    String name;
    String age;

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Animal cloneIt() {
        Cat cat=null;
        try {
            cat=(Cat)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cat;
    }

    @Override
    public void whoami() {
        System.out.println("Im a cat named "+name+" and aged "+age);
    }
}
