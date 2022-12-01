package Replit;

import java.util.HashMap;

public class Replit203 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        var iter=map.entrySet().iterator();
        while(iter.hasNext()){
            var print=iter.next();

            System.out.println("Key = "+print.getKey()+" and value = "+print.getValue());
        }
    }
}