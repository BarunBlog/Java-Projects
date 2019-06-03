
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 10;
			int y = 0;
			x = x / y;
			
			System.out.println(x);

		} catch (ArrayIndexOutOfBoundsException e1) {
			
			System.out.println("Exception: " + e1);
			
		} catch(ArithmeticException e2) {
			
			System.out.println("Exception: " + e2);
			
		}
		finally {
			
			System.out.println("Done");
			//finally always works whether catch works or not 
		}
		System.out.println("Done!");
	}

}
