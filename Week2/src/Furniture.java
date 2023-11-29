import java.util.Scanner;

public class Furniture {
	//should contain name and color 
	private String name;
	private String color;
	
	//no arg constructor
	public Furniture(){}
	
	// all arg constructor
	public Furniture(String name,String color) {
	
		this.name=name;
		this.color=color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void acceptDetails(){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	name=sc.nextLine();
	System.out.println("Enter the color:");
	color=sc.nextLine();
	
	}
	
	public void displayDetails(){
		
		System.out.println("name=" +name);
		System.out.println("color=" +color);
	}
	
	private void method1() {
		
	}
	
	

}
