import java.util.Scanner;
class advance_pattern_5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.print("please enter the butter fly no:");
        //int bt=sc.nextInt();
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }

           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        for(int i=n;i<=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             int num=0;
            for(int j=1;j<=2*num;j++){
                System.out.print(" ");
                num++;
            }

           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}