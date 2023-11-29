import java.util.Scanner;

public class Chair extends Furniture {

	private int noOfLegs;
	
	public  Chair() {
		// TODO Auto-generated constructor stub
	}
	
	public Chair(int noOfLegs) {
		
		this.noOfLegs=noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public void acceptDetails() {
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of legs");
		noOfLegs=sc.nextInt();
		
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("No of Legs=" +noOfLegs);
		
	}
	public void method1()
	{
		System.out.println("method1");
	}

}
