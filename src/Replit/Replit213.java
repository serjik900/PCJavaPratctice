package Replit;

import java.util.Scanner;


public class Replit213 {
/*Create a method that will do temperature check. Anytime user passes temperature
that is below 32 method should throw an Exception saying "It is freezing"
In Main method call the method and handle an Exception
**Expected Output:**
java.lang.RuntimeException: It is freezing*/

    public static void main(String[] args) throws RuntimeException {
try{
        TemperatureCheckException(31);

    }catch(Exception e){
    System.out.println(e);
    }}

    public static void TemperatureCheckException (int temp) throws RuntimeException {
if(temp<32){
throw new RuntimeException("It is freezing");
}

    }    }

