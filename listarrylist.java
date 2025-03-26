import java.util.*;
public class listarrylist{
    public static void main(String args[]){
        ArrayList<String> name =new  ArrayList<String>();
        name.add("vaishnavi");
        name.add("vishu");
        name.add("aditi");
        name.add("kedar");
        name.add("bhumi");
        Iterator it=name.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}