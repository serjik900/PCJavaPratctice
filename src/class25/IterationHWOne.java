package class25;

import java.util.ArrayList;

public class IterationHWOne {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Pete");
        names.add("Bob");
        names.add("John");
        names.add("Michelle");
        names.add("Steve");


        var iterator=names.iterator();

        while (iterator.hasNext()){
            var name=iterator.next();
            if(name.endsWith("e")||name.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}