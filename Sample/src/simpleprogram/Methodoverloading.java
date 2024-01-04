package simpleprogram;

public class Methodoverloading {
	public void student(int id) {
		System.out.println(id);	
		}
	public void student(float age) {
		System.out.println(age);	
		}
	public void student(String name) {
		System.out.println(name);	
		}
	public static void main(String[]args) {
		Methodoverloading obj=new Methodoverloading();
		obj.student(1);
		obj.student(20);
		obj.student("Bhuvani");
	}

}
