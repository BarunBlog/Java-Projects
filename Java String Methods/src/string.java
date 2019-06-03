import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		int ln=str1.length();
		System.out.println("Length of the sting is: "+ln);
		str2 = sc.nextLine();
		System.out.println("concatenation of string: "+str1.concat(str2));
		System.out.println(str1.indexOf("t"));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
	}

}
