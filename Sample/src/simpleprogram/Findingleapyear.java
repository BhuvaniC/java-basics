package simpleprogram;

public class Findingleapyear {
public static void main(String[]args) {
	System.out.println("***Finding Leap year***");
	int year=2024;
	if((year%4==0)&&(year%100 != 0)||(year%400==0))
	{
		System.out.println("This is a leap year");
		
	}else {
       System.out.println("This is not a leap year");
	}
	
//	System.out.println("***Printing Even numbers***");
//	int i=0;
//	for(i=0;i<=30;i++) {
//		if(i%2==0) {
//			System.out.println(i);
//		}
//	}
}
}
