package Replit;

import java.util.*;

public class Replit191 {

        public static void main(String[] args) {
/*
            List<String> countries = new LinkedList<>();
            countries.add("Armenia");
            countries.add("USA");
            countries.add("Kazakhstan");
            countries.add("Australia");
            countries.add("Pakistan");
            countries.add("Russia");
            countries.add("Azerbaijan");



            Iterator<String> iter=countries.iterator();
            while(iter.hasNext()){
                String country= iter.next();
                if(country.startsWith("A")){
                    iter.remove();
                }

            }
            System.out.println(countries);*/

            LinkedHashSet<String> numbers=new LinkedHashSet<>();
            numbers.add("third");
            numbers.add("first");
            numbers.add("second");

            Iterator <String> iter=numbers.iterator();
            while(iter.hasNext()){
              String num=iter.next();



            }

            System.out.println(numbers);

            iter.remove();
            System.out.println(numbers);


        }
    }
    /*    var iterator=names.iterator();

        while (iterator.hasNext()){
            var name=iterator.next();
            if(name.endsWith("e")||name.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}*/