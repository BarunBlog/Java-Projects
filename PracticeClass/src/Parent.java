import java.util.Scanner;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Student obj1 = new Student();///Object created
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		obj1.name=str;
		obj1.studentInfo();
	}

}
