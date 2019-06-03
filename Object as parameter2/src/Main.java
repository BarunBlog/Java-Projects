
public class Main {

	public static void main(String[] args) {
		
		Test ob1 = new Test(12,15);
		Test ob2 = new Test(12,15);
		Test ob3 = new Test(13,14);
		System.out.println("ob1 == ob2 : "+ob1.objectCheck(ob2));
		System.out.println("ob1 == ob3 : "+ob1.objectCheck(ob3));
	}

}
