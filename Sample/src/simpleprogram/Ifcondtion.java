package simpleprogram;

public class Ifcondtion {
public static void main(String[]args) {
	System.out.println("If condition");
	int age=17;
	if(age>18)
	{
		System.out.println("you are eligible for voting");
	}else if(age==18)
	{
		System.out.println("you are eligible for voting");
	}
	else
	{
	System.out.println("sorry..You are not eligible for voting");	
	}
	
//switch case
	System.out.println("Switch case");
	int day=8;
	switch(day) {
	
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
		default:
			System.out.println("Invalid");
			break;
	}
	//break & continue in for loop

	for(int z=0;z<=10;z++) {
		if(z==5) {
			continue;
		}
		System.out.println(z);
	}
	
}
}
