package class25;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Serhii");
        names.add("Tanya");
        names.add("Patel");
        names.add("Michrel");
        names.add("Bob");
        names.remove("Bob");
        System.out.println(names.toString().toLowerCase().length()+" "+names.size());
    }
}
