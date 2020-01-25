package Prototype;

public class Dog implements Animal{
    private String name;
    private String age;

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Animal cloneIt() {
        Dog dog=null;

        try {
            dog=(Dog)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

    public void whoami(){
        System.out.println("Im a dog named "+name+" and aged "+age);
    }
}
