package Replit;

import java.util.HashMap;

public interface Replit207 {
    class Main {
        public static void main(String[]args){
            HashMap<String,String> map=new HashMap<>();
            map.put("ONE","AAA");
            map.put("TWO","BBB");
            map.put("THREE","CCC");
            map.put("FOUR","DDD");
            map.put("FIVE","EEE");
            System.out.println("HashMap Before Replace :");
            var iter=map.entrySet().iterator();
            while(iter.hasNext()){
                var print=iter.next();
                System.out.println(print.getKey()+" : "+print.getValue());
            }
            System.out.println("------------------");
            System.out.println("HashMap After Replace :");


map.replace("FIVE","SUMAIR");
map.replace("THREE","ASEL");
            var iter1=map.entrySet().iterator();
            while(iter1.hasNext()){
                var print=iter1.next();
                System.out.println(print.getKey()+" : "+print.getValue());

                }
            }



        }
    }

