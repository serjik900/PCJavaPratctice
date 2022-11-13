package class25;

import java.util.ArrayList;

public class IterationHWTwo {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
       drinks.add("Soda");
       drinks.add("Juice");
       drinks.add("Vodka");
       drinks.add("Rum");
       drinks.add("Drink");


        var iterator=drinks.iterator();

        while (iterator.hasNext()){
            var drink=iterator.next();
            if(drink.contains("e")||drink.contains("a")){

                System.out.println("Water");
            }else{

                System.out.println(drink);
            }
        }

    }
}
