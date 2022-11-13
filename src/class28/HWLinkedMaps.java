package class28;

import java.util.LinkedHashMap;

/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map**/
public class HWLinkedMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
map.put(1,"Google");
map.put(2,"Facebook");
map.put(3,"Syntax");
map.put(4,"Tesla");
map.put(5,"Dell");
map.put(6,"Samsung");
map.put(7,"Google");

        System.out.println(map.size());

        map.replace(4,"Tesla","BMW");
        System.out.println(map);

        map.remove(7);

        System.out.println(map);
    }
}
