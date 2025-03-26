import java.util.Scanner;

public class function_6{

    static int printSum(int num1,int num2){
        return num1+num2;
    }

    static int calculateProduct(int n1,int n2)
    {
        return n1*n2;
    }

    static int factoria(int n){
        int temp=1;
        if(n<0){
            System.out.println("invalid number please correct it!");
            return 0;
        }
        else{
        for(int i=n;i>=1;i--){
            temp=temp*i;
        }
        return temp;
        }
    }
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter any two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int sum=printSum(a,b);
        System.out.println("sum of Number is:"+printSum(a,b));
        System.out.println("product of Number is:"+calculateProduct(a,b));
        System.out.println("factoorial of Number is:"+factoria(a));
    }
}