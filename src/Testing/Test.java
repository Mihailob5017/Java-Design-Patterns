package Testing;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Objekat>lista=new ArrayList<>();
        lista.add(new Objekat("Bonton","Becic"));
        lista.add(new Objekat("Svaba","Simic"));
        lista.add(new Objekat("Anton","Milosavljevic"));
        lista.add(new Objekat("Anton","Anic"));
        lista.add(new Objekat("Bezan","Virljak"));
        lista.add(new Objekat("Furjan","Filipovic"));
        lista.add(new Objekat("Svaba","Markovic"));

        System.out.println("Ne soritrana lita ");
        for (Objekat obj:lista)
            System.out.println("Ime: "+obj.getName()+"\tModel: "+obj.getModel());
        Objekat temp;
        for(int i=0;i<lista.size();i++)
            for(int j=i+1;j<lista.size();j++)
            {
                if(lista.get(i).getName().compareTo(lista.get(j).getName())==0)
                    if(lista.get(i).getModel().compareTo(lista.get(j).getModel())>0)
                    {
                        temp=lista.get(i);
                        lista.set(i,lista.get(j));
                        lista.set(j,temp);
                    }
                else if(lista.get(i).getName().compareTo(lista.get(j).getName())>0){
                        temp=lista.get(i);
                        lista.set(i,lista.get(j));
                        lista.set(j,temp);
                }
            }
            System.out.println("\n\nSoritrana lita ");
            for (Objekat obj:lista)
                System.out.println("Ime: "+obj.getName()+"\tModel: "+obj.getModel());


//
//
//        lista.sort(new Comparator<Objekat>() {
//            @Override
//            public int compare(Objekat o1, Objekat o2) {
//               if(o1.getName().compareTo(o2.getName())==0)
//                   return o1.getModel().compareTo(o2.getModel());
//               else
//                   return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println("\n\nSoritrana lita ");
//        for (Objekat obj:lista)
//            System.out.println("Ime: "+obj.getName()+"\tModel: "+obj.getModel());
//




    }
}
