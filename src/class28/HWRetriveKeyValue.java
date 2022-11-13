package class28;

import java.util.LinkedHashMap;

public class HWRetriveKeyValue {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet. */

        LinkedHashMap<Integer,String> items=new LinkedHashMap<>();
        items.put(342435,"Printer");
        items.put(1221214,"TV");
        items.put(909090,"Speaker");
        items.put(55555,"Vacuum");
        items.put(222222,"Washer");

        var list=items.entrySet();
        System.out.println(list);
    }
}
