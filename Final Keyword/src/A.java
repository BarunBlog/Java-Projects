
public class A {
	final String STR = "MU"; // here str is constant
	final int F; // blank final variable
	int a;
	// STR = "LU" // error. cannot be changed...
	
	A() {
		F = 39;
	}

	void printValues() {
		System.out.println(STR+" "+F);
	}
	final void display()
	{
		System.out.println("Barun");
	}
}
