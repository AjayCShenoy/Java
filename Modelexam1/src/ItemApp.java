import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ItemApp {
	
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no. of Items");
	 int n=sc.nextInt();
	 List<Item> itemList=new ArrayList<Item>();
	 
	 for(int i=0;i<n;i++) {
		 String detail=sc.nextLine();
		 if(detail.equals(""))
			 detail=sc.nextLine();
		 Item item=Item.createItem(detail);
		 itemList.add(item);
			 
	 }
	 int choice=0;
	 
	 System.out.println("Enter a type to sort:\r\n" + 
				"1.Sort by name\r\n" + 
				"2.Sort by price\r\n" + 
				"");
	 choice=sc.nextInt();
	 switch(choice)
	 {
	 case 1:
	Collections.sort(itemList);
    break;
    
	 case 2:
    Collections.sort(itemList,new PriceComparator());
    break;		 
	 }
	 System.out.format("%-20s %-10s %-12s\n","Name","Price","Type");
	 for(Item i:itemList)
		 System.out.println(i);
		 
	 }
	 
 }

