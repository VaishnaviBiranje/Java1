import java.util.Scanner;
class string_9{

public static void main(String args[] ){
    Scanner sc=new Scanner(System.in);
 String firstName="vaishnavi";
 System.out.println("Name of student is :" + firstName);

 System.out.println("please enter your full name:");
 String name =sc.nextLine();
 System.out.println("my name is name: "+name); 

//concatenate

System.out.print("please enter your first name: ");
String fname =sc.nextLine();
System.out.print("please enter your last name: ");
String lname =sc.nextLine();
String fullname= fname +" "+ lname;
System.out.println("your fullname is: "+fullname);

//charAt
for(int i=0;i<fullname.length();i++){
System.out.println(fullname.charAt(i));
}

if(fname.compareTo(lname)==0){
    System.out.println("you enter invalid name please enter valid name!");
}
else{
    System.out.println("correct you right!");
}
//it is wrong method
if(fname==lname){
    System.out.println("you enter invalid name please enter valid name!");
}
else{
    System.out.println("correct you right!");
}

if(fname.equals(lname)){
    System.out.println("you enter invalid name please enter valid name!");
}
else{
    System.out.println("correct you right!");
}

System.out.print(fullname.substring(0,5));

String no="124";
int num=Integer.parseInt(no);
System.out.println(num);

int no1=123;
String str=Integer.toString(no1);

System.out.print("please enter the email id:");
String email=sc.nextLine();
String username=" ";
for(int i=0;i<=email.length();i++)
{
 if(email.charAt(i) == '@')
 {
    break;
 }
 else
 {
    username = username + (email.charAt(i));
 }
}
System.out.println("username is "+username);

System.out.println("please enter the size of string array: ");
int size = sc.nextInt();
String nam[] = new String[size];
int len=0;
System.out.println("enter the name : ");
for(int i=0;i<size;i++){
    nam[i] = sc.next();
    len=len + nam[i].length();
}
System.out.println("total character in string array : " + len);
}
}