package class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

   /*   for(Double value: items.values()){
          System.out.println(value); */

    //  Set<Map.Entry<String, Double>> entrySet =items.entrySet();
/*var entrySet=items.entrySet();
        System.out.println(entrySet);

    var iterator=items.entrySet().iterator();

    while  (iterator.hasNext()){
        var item=iterator.next();
        var key=item.getKey();
        var value=item.getValue();
        if(key.contains("e")&&value>10){
            iterator.remove();
        }
    }*/
        items.entrySet().removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10);

        System.out.println(items);
        }
    }

