
public class myClass1 {
	int length;
	int width;
	int height;
	myClass1() //constructor
	{
		System.out.println("Constructor");
	}
	public int getCubeValue()
	{
		return length*width*height;
	}
	
	myClass1(int a,int b,int c)//another constructor
	{
		length=a;
		width=b;
		height=c;
	}
}
