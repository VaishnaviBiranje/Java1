import java.util.Scanner;

class pattern_4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //solid square
        System.out.print("Please enter which you want that rectangle:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no;j++)
                {
                     System.out.print("*");
                }
        System.out.print("\n");
         }

         //hollo square
        System.out.print("enter no:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num ||j==1 ||j==num){
                  System.out.print("*");
                }
                else{
                  System.out.print(" ");  
                }

            }
            System.out.print("\n");
        }

        //rectangle
        System.out.print("Please enter which you want that rectangle:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                {  
                     System.out.print("*");   
                }
        System.out.print("\n");
         }

        //invert-rectangle
        System.out.print("Please enter which you want that rectangle:");
        int m=sc.nextInt();
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            System.out.print("\n"); 
        }

      //
      System.out.print("Please enter which you want that rectangle:");
        int numb=sc.nextInt();
        for(int i=1;i<=numb;i++){
            for(int j=1;j<=numb;j++){
                if(j<=numb-i)
                {
                    System.out.print(" ");
                }
                else{
                 System.out.print("*");   
                }
            }
            System.out.print("\n");
        }

        //
        System.out.print("Please enter which you want that no of rectangle:");
        int nth=sc.nextInt();
        for(int i=1;i<=nth;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
             System.out.print("\n");
        }

        //
        System.out.print("please enter you want that inverted prymid in number: ");
        int mth=sc.nextInt();
        for(int i=1;i<=mth;i++){
            for(int j=1;j<=mth-i+1;j++){
              System.out.print(j+" "); 
            }
             System.out.print("\n");
        }

        //print floyd's triangle

        System.out.print("please enter you want that inverted prymid in number: ");
        int f=sc.nextInt();
        int number=1;
        for(int i=1;i<=f;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.print("\n");
        }

        //1
        //0 1
        //1 0 1
        //0 1 0 1
        
        System.out.print("please enter the pattern bit for no");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
      
    }

}