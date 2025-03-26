import java.util.Scanner;
class loop_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<11;i++){
            System.out.println(i);
        }

        int m= 20;
        while(m < 40){
        System.out.println(m);
        m++;
    }
   int p=1;
    do{
        System.out.println("My Name Is Vaishnavi!");
       p++;
    }while(p<10);

    int temp=0;
    System.out.println("please enter the no:");
    int no =sc.nextInt();
    for(int i=0;i<=no;i++){
        temp=temp+i;
    }
    System.out.println("sum of "+no+" is "+temp);
    
   System.out.println("please enter the no:");
   int num =sc.nextInt();
   for(int i=1;i<=10;i++){
    System.out.println(num*i);
   } 
    }
}

