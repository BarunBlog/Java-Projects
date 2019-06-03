
public class Test {
	int x,y;
	Test(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	boolean objectCheck(Test test)
	{
		if(test.x == x && test.y == y) {
			System.out.println(test.x+" "+x+" "+test.y+" "+y);
			return true;
		}
		else {
			System.out.println(test.x+" "+x+" "+test.y+" "+y);
			return false; 
		}
	}
}
