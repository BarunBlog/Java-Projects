
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = A.retOb();
		
		A obj1 = new A();
		A obj2 = new A();
		boolean a = obj1.equals(obj2);
		System.out.println(a);
		A obj3;
		obj3=obj1.clone();
	}

}
