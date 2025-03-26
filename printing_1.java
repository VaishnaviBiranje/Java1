import java.util.Scanner;
class printing_1{
    public static void main(String[] args){
        System.out.print("Hi my name is vaishnavi from rashiwde");
        System.out.print("good morning!");

        System.out.println("Hi my name is vaishnavi from rashiwde");
        System.out.print("good morning!");

        System.out.print("\nHi my name is vaishnavi from rashiwde");
        System.out.print("good morning!");

        System.out.println("Hi my name is vaishnavi from rashiwde");
        System.out.println("good morning!");

        System.out.print("\nHi my name is vaishnavi from rashiwde\n");
        System.out.print("good morning!");
        //"\n"<---indicate next line
        //example: 1.System.out.print("\nHi my name is vaishnavi from rashiwde");  <<first take next line and print statment.
        //         2.System.out.print("Hi my name is vaishnavi from rashiwde\n");  <<first print statment and go to next line.
        //"println"<---indicate print satement and goto next line

        System.out.print("\n*\n");
        System.out.print("* *\n");
        System.out.print("* * *\n");
        System.out.print("* * * *\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");


        //1byte = 8bit
        //1bit = 0 or 1


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.print(name);
        System.out.println("Enter Your Age:");
        int num= sc.nextInt();
        System.out.print(num);
        System.out.println("Enter Your Marks:");
        float Marks = sc.nextFloat();
        System.out.print(Marks);

        
        System.out.println("Enter Number1:");
        int a=sc.nextInt();
        System.out.println("Enter Number2:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of number is:"+ sum);


    }
}