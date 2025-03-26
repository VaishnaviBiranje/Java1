import java.util.*;
class stringbild_10{
    public static void main(String args[]){
      StringBuilder sb = new StringBuilder("vaishnavi");
      System.out.println(sb);

      StringBuilder s=new StringBuilder("Happy BIRTHDAY");
      System.out.println(s);
      
      //charAt
      System.out.println(s.charAt(4));
      //setCharAt
      s.setCharAt(0,'g');
      System.out.println(s);
      //insert
      s.insert(0,'v');
      System.out.println(s);
      //delete
      s.delete(0,2);
      System.out.println(s);
      //append
      s.insert(0,'h');
      s.append(" vaishnavi");
      System.out.println(s);
      //length
      System.out.println(s.length());


    }
}