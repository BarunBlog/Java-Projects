
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello ob = new hello();
		hello.DoSomething("Barun Bhattacharjee");
		ob.DoSomethingElse("Partho");
		hello.a = 5;
		hello.b = 10;
		System.out.println("The sum of "+hello.a+" and "+ hello.b+" is:");
		System.out.println(sum(hello.a,hello.b));
	}
	static int sum(int a,int b)
	{
		return a+b;
	}
		
}
