import java.util.Scanner;
/*class recuresion_one_1{
    static void num(int n){
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
         num(n-1);
        
    }
    public static void main(String args[]){
      System.out.print("pleas enter the no:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      num(n);
    }
}*/

/*class recuresion_one_1{
    static void num(int n){
        if(n==6)
        {
            return;
        }
        System.out.print(n+" ");
         num(n+1);
        
    }
    public static void main(String args[]){
      System.out.print("please enter the no:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      num(n);
    }
}*/

/*class recuresion_one_1{
    static int num(int n,int m,int sum)
    {
        
        if(n>m)
        {
        
            return sum;
        }
       else{ sum = sum + n;
       return num(n + 1,m,sum);
       }
    
    }

    public static void main(String args[]){
      System.out.print("pleas enter the start no:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print("pleas enter the end no:");
      int m=sc.nextInt();
      int result = num(n,m,0);
      System.out.print(result);
    }
}*/

/*class recuresion_one_1{
    static int num(int n)
    {
        int fact=1;
        if(n==0 ||n==1){
            return 1;
        }
        
        
        return n * num(n-1);
    
    }

    public static void main(String args[]){
      
      Scanner sc=new Scanner(System.in);
       System.out.print("pleas enter the start no:");
      int n=sc.nextInt();
        int result = num(n);
        System.out.print("factorial is:"+result); 
    
    }
}*/

/*class recuresion_one_1{
    static void num(int n)
    {
        int fact=1;
        if(n==0){
         return;  
        }
        System.out.println(n); 
        num(n-1);
    

    public static void main(String args[]){/
      Scanner sc=new Scanner(System.in);
      System.out.print("pleas enter the start no:");
      int n=sc.nextInt();
      num(n);
    }
}


class recuresion_one_1{
    static void num(int n,int m)
    {
        int fact=1;
        if(n>m){ 
         return;  
        }
        System.out.println(n); 
        num(n+1,m);
    
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("pleas enter the end no:");
      int m=sc.nextInt();
      num(1,m);
    }
}

class recuresion_one_1{
    static void num(int n)
    {
        int fact=1;
        if(n==0){ 
         return;  
        }
        num(n-1);
        System.out.println(n);         
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("pleas enter the end no:");
      int n = sc.nextInt();
      num(n);
    }

// 0 1 1 2 3 5 8 13
class recuresion_one_1{
    static void num(int n ,int f,int s)
    {
        int fact=1;
        if(n==0){ 
         return ;  
        }
       int c;
       System.out.print(f+" ");
        c = f + s;
            f = s;
            s = c;
        num(n-1,f,s);

    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("pleas enter the end no:");
      int n = sc.nextInt();
      num(n,0,1);
      
    }
}

class recuresion_one_1{
    static int num(int n)
    {
        if(n==1 || n==2){
            return 1;
        }
        return num(n-1) + num(n-2);
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
    
        System.out.print("please enter the no:");
      int n = sc.nextInt();
      int result = num(n);
       System.out.print(result);
    }
}*/

class recuresion_one_1{
    static int num(int x ,int n)
    {
        
        if(n==0){ 
         return 1;  
        }
       return x * num(x,n-1) ;

    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("please enter the base no:");
      int x = sc.nextInt();
      System.out.print("please enter the exponatial no:");
      int n = sc.nextInt();
      int result = num(x,n);
      System.out.print(result);
    }
}
