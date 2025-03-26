import java.util.Scanner;
class array_one_d_8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=67;
        arr[1]=56;
        arr[2]=90;
        arr[3]=99;
        arr[4]=86;
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");

        }
             System.out.println("");

        int array[]={45,46,47,48,49,50,51,52};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("");
        System.out.println("please enter the size of array:");
        int size=sc.nextInt();
        
        int arr1[]=new int[size];
        System.out.println("please enter the array element:");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("element of array are:");
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("enter the element which you want search:");
        int search=sc.nextInt();
        int f=0;
        for(int i=0;i<size;i++){
            if(arr1[i]==search){
                f=1;
                System.out.print(search+" element is found at position "+i);
                break;
            }
            
        }
        if(f==0){
            System.out.print(search+" element is not found ");
        }

    }
}