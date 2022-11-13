package class28;

import java.util.TreeMap;

/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/
public class Constructor {
    public static void main(String[] args) {
        TreeMap<String,Person> personDetails=new TreeMap<>();
        personDetails.put("1",new Person("Bob","Smith",10,1000000));
        personDetails.put("2",new Person("John","Wick",40,10000));
        personDetails.put("3",new Person("Samantha","Johnson",50,40000));

        for (var s : personDetails.values()) {
            System.out.println(s.printDetails());

        }
    }
}
class Person{
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    String printDetails(){
        return "Name "+name+" Last Name "+lastName+" Age "+age+" Salary "+salary;
    }
}
