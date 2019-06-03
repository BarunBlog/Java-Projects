import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Admin\\Desktop\\My_folder");
		file.mkdir();
		String path = file.getPath();

		File file1 = new File(path + File.separator + "my1.txt");
		File file2 = new File(path + File.separator + "my2.txt");

		if (file1.exists() && file2.exists()) {
			System.out.println("file1 and file2 allready exists");
			file1.delete();
			file2.delete();
		} else {
			try {
				file1.createNewFile();
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileWriter fw = null;
		BufferedWriter bw = null;

		Scanner sc = new Scanner(System.in);

		try {
			fw = new FileWriter(file1);
			bw = new BufferedWriter(fw);

			String str = sc.nextLine();
			bw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file2);
			br = new BufferedReader(fr);

			String output;
			try {
				while ((output = br.readLine()) != null) {
						System.out.println(output);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
