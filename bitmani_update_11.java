import java.util.Scanner;
class bitmani_update_11{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int n=5;
        System.out.print("please change bit to what that enter(0/1):");
        int oprat=sc.nextInt();
        System.out.print("Please enter the position:");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        int newbit;
        if(oprat==0){
            //clear
            newbit = (~ bitmask) & n;
        }
        else{
            //set
            newbit = bitmask | n;
        }
        System.out.print("updated bit is:"+newbit);
    }

}