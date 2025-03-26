import java.util.Scanner;
class conditional_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your nativ place:"); 
        int from1=sc.nextInt();

        if(from1 == 1){
        System.out.println("Nmaste!");
        }
        else if(from1 == 2)
        {
        System.out.println("hello!");
        
        }
        else if(from1 ==3)
        {
            System.out.println("sastriyakhan");
        } 
        

        //switch statment
        System.out.print("please enter your current cgp:");
        int cgp=sc.nextInt();
        switch(cgp)
        {
        case 6: System.out.print("all the best!.\nplease try your best");
                break;
        case 7: System.out.print("all the best!.\ngood do better in next time");
                break;
        case 8: System.out.print("all the best!.\ngood job");
                break;     
        case 9: System.out.print("all the best!.\nnice job");
                break;
        case 10: System.out.print("All the best!.\nvery very good keep it up");  
                break;
        default:System.out.println("nothing!");

        }
    }

}