import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		Main1 obj = new Main1(x,y,z);
		obj.printLists();
	}

}
