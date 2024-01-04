package simpleprogram;

import java.util.Scanner;

public class findipalindrome_num {
public static void main(String[]args) {
	System.out.println("Enter a number :");
	Scanner scan= new Scanner(System.in);
	int number=scan.nextInt();
	scan.close();
//	int number=131;
	int original=number;
	int check=0;
	int temp=0;
	while(number>0) {
		temp=number%10;
		check=(check*10)+temp;
		number=number/10;
	}
	if(original == number) 
		System.out.println("it is a Palindrome");
	else
		System.out.println("its not a Palindrome");
	
	
	//reverse_string
	String word="abcd";
	for(int i=word.length()-1;i>=0;i--) {
		System.out.println(word.charAt(i));
	}
	

	
	
	//Palindrome_using_forloop
	String word1="refer";
	String word2="";
	for(int i=word1.length()-1;i>=0;i--) {
		word2=word2+word1.charAt(i);
	}if(word1.equals(word2)) 
		System.out.println("It is a Palindrome");
		else
		System.out.println("It is not a Palindrome");
	
}
}
