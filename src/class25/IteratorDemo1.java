package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Serhii");
        names.add("Tanya");
        names.add("Patel");
        names.add("Michrel");
        names.add("Bob");
        names.remove("Bob");

        Iterator<String> iterator=names.iterator();
        while ((iterator.hasNext())){
            String item =iterator.next();

            if(iterator.next().endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
