package Replit;

public class test {
    public static void main(String[] args) {
        String[] str="Hello my name is John".split(" ");
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
        System.out.println(rev);

    }
}
