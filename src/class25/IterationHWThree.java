package class25;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class IterationHWThree {
    public static void main(String[] args) {
        ArrayList<Integer>numbers= new ArrayList<>(500);

for(int i=0;i<=500;i+=2){
    if(!(i%5==0)){
    numbers.add(i);
    }
}
        System.out.println(numbers);
    }
}
