package class30;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());//lane contains issues
        } catch(Exception e){
            System.out.println("Backup code");
        }
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");

    }
}
