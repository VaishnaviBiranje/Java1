import java.util.*;
public class man{
    public static void main(String args[]){
        /*Vector<String> lis =new Vector<String>();
        System.out.print("in vector add elenemt()method are used toadd");
        lis.add("tiger");
        lis.add("lion");
        lis.add("monkey");
        System.out.println(lis);*/
  
  
  
        /*HashSet name = new HashSett();
        name.add(10);
        name.add("name");*/

        TreeSet<String> animal=new TreeSet<String>();
        animal.add("DOG");
         animal.add("CAT"); 
          animal.add("LION");
          animal.add("FOX");
          System.out.println(animal);
          System.out.println(animal.descendingSet());
           System.out.println(animal.pollFirst());
           System.out.println(animal.headSet("LION"));
           System.out.println(animal.tailSet("FOX"));

    }
}