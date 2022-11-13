package class28;
/*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class HWTreeMapIterFor {
    public static void main(String[] args) {
        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Mexico","Mexico City");
        countries.put("Nicaragua","Managua");
        countries.put("Honduras","Tegucigalpa");
        countries.put("Guatemala","Guatemala city");

        Iterator< Map.Entry<String,String>> iterator=countries.entrySet().iterator();

        while(iterator.hasNext()){
            var list=iterator.next();

            System.out.println(list);

        }
        System.out.println("**********************************");
        for (var s : countries.entrySet()) {
            System.out.println(s);
        }
        System.out.println("**********************************");
        var countryValueIterator= countries.values().iterator();
        while(countryValueIterator.hasNext()){
            var printValues=countryValueIterator.next();
            System.out.println(printValues);
        }

        System.out.println("**********************************");
        for (String value : countries.values()) {
            System.out.println(value);

        }

    }
}
