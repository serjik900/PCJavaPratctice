package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        //right click on your file copy path
        String path="Data/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);// navigate to the file
        var properties=new Properties();//that special software which helps us read data from that file

properties.load(fileInputStream);//loads all the data from the file inside(Memory);
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();
    }
}
