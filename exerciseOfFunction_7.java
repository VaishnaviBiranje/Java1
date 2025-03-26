import java.util.Scanner;

class exerciseOfFunction_7
{ 
    static void printavg(float a,float b,float c){
        System.out.println("Average of "+ a + b + c +" is "+(a+b+c)/3);
    }

    static void printodd(int n){
        int temp=0;
        
        for(int i=0;i<=n;i++){
            
           if(i%2==0){

           }
           else{
                   temp=temp+i;
           }
            
          //1+3+5+7+9=25
        }
           System.out.println("sum of odd numbers is: "+temp);
    }

     static int grater(int mno,int nno){
        if(mno > nno){
            return mno;
        }
        else{
            return nno;
        }
    }

    
    static double curcumfrance(float radius){
        return 2.0*3.14*radius;
    }

    static void agecheck(int age){
        if(age>18){
            System.out.println("you are eligible for vote!");
        }
        else{
         System.out.println("you can not eligible for vote!");   
        }
    }


    static int findexp(int xth,int nth){
        int temp=1;
        for(int i=1;i<=nth;i++){
            temp=temp*xth;
        }
         return temp;
    } 

    static void sepration(int nw){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter no which you wants:");
        int temp,po=0,ne=0,z=0;
        for(int i=1;i<=nw;i++){
         temp=sc.nextInt();
         if(temp==0){
            z++;
         }
         else if(temp>0){
            po++;
         }
         else{
            ne++;
         }

        }
        System.out.println("total positive no is "+ po +" total negative no is " + ne+" total no of zerose is "+z);
    }

    static void fibonachi(int fibo){
        int a=0,b=1,c;
        for(int i=1;i<=fibo;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("plase enter the three number:");
         float a= sc.nextInt();
         float b= sc.nextInt();
         float c= sc.nextInt();
        printavg(a,b,c);

       System.out.print("plase enter number:");
       int n= sc.nextInt();
       printodd(n);
       
       System.out.print("plase enter two number  :");
       int nno= sc.nextInt();
       int mno= sc.nextInt();
       System.out.println("gratest no:"+ grater(nno,mno));

       System.out.print("plase enter radius of circle is :");
       int radius= sc.nextInt();
       System.out.println("circumfarance of circle is:"+curcumfrance(radius));

       System.out.print("please enter your age:");
       int age=sc.nextInt();
       agecheck(age);
       
       System.out.println("please enter the base:");
       int xth=sc.nextInt();
        System.out.println("please enter the power:");
       int nth=sc.nextInt();
       System.out.println(xth+ " pow "+ nth +" is "+ findexp(xth,nth));

        System.out.println("please enter the no which u want:");
        int nw=sc.nextInt();
        sepration(nw);

        System.out.println("Enter the fibonachi of:");
        int fibo=sc.nextInt();
        fibonachi(fibo);
    }
}




//1 1 2 3 5 8 13 21