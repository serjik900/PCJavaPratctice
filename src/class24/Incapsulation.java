package class24;

public class Incapsulation {
}
class Dog{


    String name;
    String breed;
    int age;
    double weight;
    Dog(String name,String breed, int age, double weight){

        setName(name);

        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    void setName(String name){
        if(name.length()>3) {
            System.out.println();
        }else if(name.isEmpty()) {
            System.out.println("cant be emptyy");
        }else{
            this.name=name;
        }
    }
    void printInfo(){

        System.out.printf("Name"+name+"Breed"+breed);
    }
    class Test{
        public static void main(String[] args) {
            Dog tommy=new Dog("erwermmy","chihua",23,23);
            // tommy.name="Tommy"; need to initialize without constructor
            tommy.printInfo();
        }
    }

}