package Replit;

import java.util.ArrayList;


class Replit220 {
    public static void main(String[] args) {
        System.out.println(formatString("123456789"));
    }
    public static String formatString(String S) {
        String newStr="";
        String str="";
        //int interval=3;
        String dash="-";
        //replace all spaces
        String s2=S.replaceAll("[^0-9]","");
        StringBuilder sb=new StringBuilder(s2);
        int length = s2.length();
        int j=3;
        for(int i=0; i<length; i+=3){
            // sb.insert(((i+1)*interval)+i, dash);
            if(j<length){
                newStr = sb.substring(i, j);
                str += newStr+dash;

            }else{
                newStr = sb.substring(i, j);
                str+=newStr;
            }
            j+=3;

        }
        return str.substring(0,str.length());
    }

}