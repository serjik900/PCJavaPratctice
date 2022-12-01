package Replit;

public class Replit225 {
    public static void main(String[] args) {

        int reverse=reverseInteger(123456);


        System.out.println(reverse);
    }
    public  static int reverseInteger(int N){
int reversed=0;
while (N !=0){
    int digit=N%10;
    reversed=reversed*10+digit;
    N/=10;
}
return reversed;

    }
}
