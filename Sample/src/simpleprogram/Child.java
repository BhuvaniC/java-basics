package simpleprogram;

public class Child extends Father {
	public void age() {
		System.out.println(10);
	}
	
public static void main(String[]args) {
	Child Obj= new Child();
	Obj.bussiness();
	Obj.vechicle();
	Obj.properties();

}
}
