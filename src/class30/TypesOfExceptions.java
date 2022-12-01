package class30;

import utils.ExcelReader;

import java.io.IOException;

public class TypesOfExceptions {
    public static void main(String[] args){
        String name = null;
        if (name != null) {
            System.out.println(name.length());

        }
        int[] arr = new int[5];
        int index = 10;
        try {
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println("Fix the code");
        }
        if (index < arr.length) {
            System.out.println(arr[index]);

        }
        try {
            System.out.println(ExcelReader.read("C:\\Users\\Sergey\\IdeaProjects\\untitled\\Data\\test.xlsx"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Important code");
    }
}
