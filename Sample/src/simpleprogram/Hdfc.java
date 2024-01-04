package simpleprogram;

public class Hdfc extends Bank{
public void current() {
	System.out.println("This is current account");	
}
public void salary() {
	System.out.println("This is salary account");	
}
public static void main(String[]args) {
	Hdfc Obj= new Hdfc();
	Obj.current();
	Obj.salary();
	Obj.savings();
}
}
