
public class B extends A {
	double base, weight;
	
	B(){
		super(1,2);
	}
	
	void area() {
		System.out.println(0.5*base*weight);
	}
}
