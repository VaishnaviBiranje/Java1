import java.util.Scanner;
class arry{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("please enter the size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size]; 
        System.out.print("please enter the size of array: ");
        for(int i=0;i<size;i++){
           arr[i]= sc.nextInt();
        }
        System.out.println("array: ");
        for(int i=0;i<size;i++){
          System.out.print(arr[i]+" ");
        }
    }
}