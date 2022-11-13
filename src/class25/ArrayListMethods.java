package class25;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("lipstick");



        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shampoo");
 cosmetics.add("lotion");

 ArrayList<String> beauty=new ArrayList<>();
 beauty.addAll(makeUpItem);
 beauty.addAll(cosmetics);
      //  System.out.println(beauty);


       /* ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");*/


       /*
        Don`t use loops with arrayylist for(int i=0;i<beauty.size();i++){

            if(beauty.get(i).endsWith("r")){
                beauty.remove(i);
            }

        }/*/

//get the iterator from the list
        Iterator<String > iterator=beauty.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

        System.out.println(iterator.hasNext());

    }
}
