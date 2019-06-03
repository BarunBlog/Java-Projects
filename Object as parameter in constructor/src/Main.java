
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob1 = new Test(10, 20, 30);

		/// creating a copy of ob1..
		Test ob2 = new Test(ob1);
		System.out.println("Volume of ob1 is " + ob1.volume());
		System.out.println("Volume of ob2 is " + ob2.volume());
	}

}
