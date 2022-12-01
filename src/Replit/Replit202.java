package Replit;

import java.util.Iterator;
import java.util.TreeMap;

public class Replit202 {
    public static void main(String[]args){
        TreeMap<String,String> fruits=new TreeMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");

        var iter=fruits.entrySet().iterator();
        while (iter.hasNext()){
var print=iter.next();
            System.out.println("Key is "+print.getKey()+" ");
        }



    }

}