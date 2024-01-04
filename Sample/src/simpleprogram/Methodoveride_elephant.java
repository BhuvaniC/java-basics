package simpleprogram;

public class Methodoveride_elephant {
	public void animal() {
		System.out.println("Elephant is an Wild animal");
	}
	public static void main(String[]args) {
		Methodoveride_dog obj=new Methodoveride_dog();
		obj.animal();
	}

}
