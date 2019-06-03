
public class Test {
	double width,height,depth;
	
	Test(Test ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Test(double a,double b,double c){
		width=a;
		height=b;
		depth=c;
	}
	double volume()
	{
		return width*height*depth;
	}
}
