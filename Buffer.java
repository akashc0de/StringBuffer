package com.String;

public class Buffer {
    public static void main(String[]args){
         String sb=new String("121");
         //sb.append(5);
        //System.out.println(sb);
        //sb.deleteCharAt(0);
        //System.out.println(sb);
        //sb.reverse();
        //System.out.println(sb);

        StringBuffer s= new StringBuffer(sb);
        s.reverse();

        if(sb.contentEquals(s)){
            System.out.println("same values " + sb + " " + s);
        }
        else{
            System.out.println("not same "+ sb +" "+ s );
        }


    }
}
