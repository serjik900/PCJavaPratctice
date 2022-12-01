package Replit;

import jakarta.xml.bind.SchemaOutputResolver;

public class Replit226 {
    public static void main(String[] args) {
        Replit226 s = new Replit226();
       String sentence= s.reverse("Syntax is Great");
System.out.println(sentence);

    }
    public static String reverse(String strToRev){
        String[] str=strToRev.split(" ");
        String sentence="";
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            String word=str[i];
            String revWord="";

            for(int j=0;j<=word.length()-1;j++){
                rev+=word.charAt(j);

            }
            rev+=revWord+" ";
        }
        return rev.trim();
    }
}