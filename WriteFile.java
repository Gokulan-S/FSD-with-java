import java.io.IOException;
import java.io.FileWriter;
public class WriteFile {
	public static void main(String [] args) {
		try {
			FileWriter w=new FileWriter("name.txt");
			w.write("Sample-text ");
			w.write("Sample-text ");
			w.write("Sample-text ");
			w.write("Sample-text");
			w.close();
			System.out.println("file written successfully.");

		}
		catch(IOException e) {
			System.out.println("error"+e);
		}
	}
}
