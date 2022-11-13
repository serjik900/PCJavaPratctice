package class25;

import java.util.ArrayList;

public class IteratorRemoveCertain {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Serhii");
        names.add("Tanya");
        names.add("Patel");
        names.add("Michrel");
        names.add("Bob");
        names.remove("Bob");

        var iterator=names.iterator();

        while (iterator.hasNext()){
            var item=iterator.next();
            if(item.startsWith("B")||item.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
