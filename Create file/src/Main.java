import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Admin\\Desktop\\My_folder");
		file.mkdir();
		String path = file.getAbsolutePath();

		File file1 = new File(path + "\\my1.txt");
		File file2 = new File(path + "\\my2.txt");

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
	}

}
