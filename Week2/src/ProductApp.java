import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductApp {
	
	public static void main(String[]args) {
		List<Product>productlist=new ArrayList<Product>();
		
		productlist.add(new Product(5,"Pencil",12.2,"Stationary"));
		productlist.add(new Product(5,"Sharpner",12.2,"Stationary"));
		productlist.add(new Product(5,"Eraser",12.2,"Stationary"));
		productlist.add(new Product(5,"Oneplus 11",12.2,"Electronics"));
		productlist.add(new Product(5,"Mi Tv 12",12.2,"Electronics"));
		productlist.add(new Product(5,"Scale",12.2,"Stationary"));
	
	Collections.sort(productlist);
	for (Product p:productlist) {
			System.out.println(p);
	}
}
}