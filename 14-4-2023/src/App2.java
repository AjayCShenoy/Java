import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App2 {
	public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		to read object from a file
		
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("Kalyan.dat"));
		SerializationExample e=(SerializationExample) obj.readObject();
		System.out.println(e);
	}

}
