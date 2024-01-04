package simpleprogram;

public class operator {
public static void main(String args[]) {

// arithmetic operator
	int x=10;
	int y=5;
	System.out.println( x+y) ;
	System.out.println( x-y) ;
	System.out.println( x*y) ;
	System.out.println( x/y) ;
	System.out.println( x%y) ;
	int variable = 15;
	System.out.println("Original value of the variable = " + variable);

	// after using increment operator
	variable++; 	 //  increments 1, variable = 16
	System.out.println("variable++ = " + variable);

	++variable;		//  increments 1, variable = 17
	System.out.println("++variable = " + variable);
	
//assignment operator
	int a1=30;
	a1+=20;
	System.out.println("a1 value is" + a1) ;
	a1-=10;
	System.out.println("a1 value is" + a1);
	a1/=5;
	System.out.println("a1 value is" + a1);
	a1*=2;
	System.out.println("a1 value is" + a1);
	
// Comparison operator
	int c=20;
	int d=30;
	System.out.println(c==d);
	System.out.println(c!=d);
	System.out.println(c<d);
	System.out.println(c>d);
	System.out.println(c<=d);
	System.out.println(c>=d);
	
// logical operator
	int e=20;
	int f=30;
	System.out.println((e==f)&&(e>=f));
	System.out.println((e==f)||(e>=f));
	System.out.println(!(e==f)||(e>=f));
	
	
	
	
	
}
}
