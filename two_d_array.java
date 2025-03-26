import java.util.Scanner;
class two_d_array{

    public static void main(String args[] ){

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the numner of row:");
        int row =sc.nextInt();
        System.out.println("please enter the numner of column:");
        int col =sc.nextInt();

        int array[][]=new int[row][col];
        System.out.println("please enter the array elements:");
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            array[i][j]=sc.nextInt();
        }
      }

        System.out.println("array elements:");
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.print("\n");
      }

      System.out.println("enter the element which want to search:");
      int search=sc.nextInt();
      
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(search == array[i][j]){
            System.out.print(search + "element is found at position [" + i +"," + j +"]");
          }
        }
      }

    }
}