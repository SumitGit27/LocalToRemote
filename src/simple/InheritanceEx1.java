package simple;

class parent{
	public void demo() {
		System.out.println("This is Demo method");
	}
}

public class InheritanceEx1 extends parent {
	public void demo() {
		System.out.println("This is Demo method is overloaded");
	}
	public static void main(String[] args) {
		InheritanceEx1 obj = new InheritanceEx1();
		obj.demo();
	}

}
