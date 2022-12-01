package class30;

public class finallyBlockDemo {
    public static void main(String[] args) {
        try{
            doSomething();
        }catch(NullPointerException npe){
            System.out.println("Got null pointer exception");
        }
        finally{
            System.out.println("This block will execute no matter what");
        }
    }
    public static void doSomething(){
        String name=null;
        System.out.println(name.length());
    }
}