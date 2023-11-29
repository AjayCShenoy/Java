
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEx {
	public static void main(String[]args)throws FileNotFoundException {
		Scanner sc=new Scanner(new File("Ajay.txt"));
		String str=sc.nextLine();
		System.out.println(str);
	}

}
