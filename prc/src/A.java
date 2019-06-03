
public abstract class A {
	int d1, d2;

	A(int a, int b) {
		d1 = a;
		d2 = b;
	}

	abstract void area();

	void show() {
		System.out.println(d1 + " " + d2);
	}
}
