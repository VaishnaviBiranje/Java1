import java.util.Scanner;
class bitmani_clear_11{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int n=5;
        System.out.print("please enter the position:");
        int pos =sc.nextInt();
        int bitmask = 1 << pos;
        int newbit = ~(bitmask) & n;
        System.out.print(newbit); 
    }
}