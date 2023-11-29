
public class Stringrevision {
	public static void main(String[]args) {
//		String str="this is monday";
//		String result=str.replaceAll("monday", "tuesday");
//		System.out.println(str);
//		System.out.println(result);
		
		String str="this is monday.";
		String result=str.replaceAll("[.]", ",");
		System.out.println(str);
		System.out.println(result);
	}
}
