import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\kriti\\eclipse-workspace\\JavaPrograms\\src\\test.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("this is kritika");
		bw.newLine();
		bw.write("trust youself");
		bw.newLine();
		System.out.println("Done");
		bw.close();

	}

}
