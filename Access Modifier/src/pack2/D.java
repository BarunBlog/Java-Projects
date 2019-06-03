package pack2;
import pack1.A;

public class D extends A{
	D(){
		A ob1 = new A();
		D ob2 = new D();
		ob1.b=5;
		ob2.c=5;
		ob2.met1();
	}
}
