package simpleprogram;
import java.util.Scanner;
 
public class Userinput {
	public void studentname() {
		 System.out.println("bhuvi");
	 } 
	public void studentage() {
		 System.out.println(28);
	 } 
public static void main(String[]args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the values :");
	String name= obj.nextLine();
	System.out.println("user name is :" + name);
	System.out.println("Enter the age :");
	int age=obj.nextInt();
	System.out.println("User age is :"+ age);
	
	
	Userinput Obj= new Userinput();
	Obj.studentname();
	Obj.studentage();
	
}
}
