
public class Test {
	int x;
	Test(int x)
	{
		this.x = x;
	}
	Test objectUpdate()
	{
		Test temp = new Test(x+5);
		return temp;
	}
	
}
