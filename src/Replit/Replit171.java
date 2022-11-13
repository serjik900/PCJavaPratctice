package Replit;

import java.nio.channels.Pipe;

public class Replit171
{
}


class Main extends Parent1 {
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String str) {
        System.out.println("m1 method with parameter");
    }
    public static void main(String[]args) {


    }


}
abstract class Parent1{
    abstract void m1();
    abstract void m1(String str);

}
