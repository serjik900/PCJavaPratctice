public class Main {
    public static void main(String[] args) throws InterruptedException {

       int i=10;
        while( i>0){
i++;
Thread.sleep(1000);
            System.out.println(i);
        }

    }
}