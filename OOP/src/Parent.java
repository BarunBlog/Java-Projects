import java.util.Scanner;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		Scanner sc = new Scanner(System.in);
		obj.numOfWings=sc.nextInt();
		obj.color=sc.nextLine();
		obj.radious=sc.nextDouble();
		obj.print();
	}

}
