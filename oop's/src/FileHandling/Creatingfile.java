package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creatingfile {
	
		public static void main(String[] args) {
		try {
			FileOutputStream myfile=new FileOutputStream("E:\\FileHAndling\\F1");
			String s="New data being entered into the file";
			byte[] b=s.getBytes();
			myfile.write(b);
			System.out.println();
			System.out.println("Data succesfully entered into new file!");
			myfile.close();
		}
		catch(IOException e) {
			System.out.println("IO EXCEPTION OCCURED!");
		}
		}
	}


