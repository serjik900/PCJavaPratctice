package HackerRank;


public class ReverseSentenceWords {

    public static void main(String[] args) {
        String str="Fuck you and all of you";
        String rev="";

       String s[]=str.toLowerCase().split(" ");

       for( int i=0;i<s.length;i++){
           rev=s[i]+" "+rev;
       }

        System.out.println(rev);}}
