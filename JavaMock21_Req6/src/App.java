import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[]args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of purchases");
		int noOfPurchases=sc.nextInt();
		List<User>userList=User.prefill();
		List<Purchase>purchaseList=new ArrayList<>();
		
		for(int i=0;i<=noOfPurchases;i++)
		{
			String details=sc.nextLine();
			if(details.equals(""))
				details=sc.nextLine();
			String[]arr=details.split(",");
//		1,750,FIRST,05-06-2018,Rob
			Purchase purchase=new Purchase();
			purchase.setId(Integer.parseInt(arr[0]));
			purchase.setPrice(Double.parseDouble(arr[1]));
			purchase.setCouponCode(arr[2]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			purchase.setPurchaseDate(sdf.parse(arr[3]));
			String username=arr[4];
//			find user object using username
			for(User u:userList) {
				if(u.getName().equals(username)) {
					purchase.setUser(u);
					u.getPurchaseList().add(purchase);
					
				}
			}
			purchaseList.add(purchase);
		}
		System.out.println("Enter the month:");
		String month=sc.next();
		User result=User.getValuableUser(userList, month);
		System.out.println("The valuable user of the month June is" + result.getName());
		
	}
}
