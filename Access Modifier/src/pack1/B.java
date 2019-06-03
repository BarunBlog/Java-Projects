package pack1;

public class B {
	A ob1 = new A();
	protected B(){
		//ob1.met(); this is an error
		ob1.met1();
		ob1.a=1;
		ob1.b=1;
		ob1.c=1;
		//ob1.d=1; error
	}
	public B(int a) {
		System.out.println(a);
	}
	
}
