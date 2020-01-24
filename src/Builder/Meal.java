package Builder;

import java.util.ArrayList;

public class Meal {
    private String mealId;
    private double mealPrice;
    private ArrayList<Item>mealItems;

    public Meal(String mealId) {
        this.mealId = mealId;
        this.mealPrice =0;
        mealItems=new ArrayList<>();
    }
    public void addItem(Item item){
        mealItems.add(item);
    }
    public void getPrice(){
        for(Item item:mealItems){
            mealPrice+=item.price();
        }
        System.out.println("The price is "+mealPrice);
    }
    public void whatIOrdered(){
        for(Item item:mealItems){
            item.name();
            item.wrapping();
            System.out.println("----------------------");
        }

    }
}
