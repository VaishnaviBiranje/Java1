import java.util.Scanner;
class bit_manipulation_11{

    public static void main(String args[]){
        //for get
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter the bit:");
        int n=sc.nextInt();
        System.out.print("please enter the positon:");
        int pos=sc.nextInt();
        int bitmask =1<<pos;
        if((n & bitmask)==0){
            System.out.print("At position "+ pos +" 0 bit present");

        }
        else{
         System.out.print("At position "+ pos +" 1 bit present");
   
        }


    }
}