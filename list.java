import java.util.*;
class list{

    public static void main(String args[]){
        private int[] list={5,6,8,9,2};
        public void writeList(){
            PrintWriter out=null;
          
        }
        try{
            System.out.println("entering try ststement");
            out=new PrintWriter(new FileWriter(fileName:"outputfile.text"));

            for(int i=0;i<7;i++){
                out.println("value at:"+i+"="+list[i]);
            }
        }
        catch(Exception e){
            System.out.print("exception:"+e.getMessage());

        }
        finally{
            if(out !=null){
                System.out.println("close printwriter");
                out.close();
            }
            else{
                System.out.println("printWriter not open");
            }
        }

    }
    }