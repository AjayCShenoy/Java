import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.Scanner;

public class AppSerial  {
	public static void main(String[]args) throws FileNotFoundException, IOException {
		//get input from user
		Scanner sc=new Scanner(System.in);
		String detail=sc.nextLine();
//		create an object of employee from csv
		String[]arr=detail.split(",");
		SerializationExample emp=new SerializationExample();
		emp.setId(Integer.parseInt(arr[0]));
		emp.setFirstname(arr[1]);
		emp.setLastname(arr[2]);
		emp.setLocation(arr[3]);
		
//		lets write this object to a file
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Kalyan.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		
		System.out.println("Done");
		

	}

}
