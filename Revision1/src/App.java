
public class App {
	public static void main(String[]args) {
//		String str="Malayalam is a language";
//				String []arr=str.split(" ");
//						System.out.println(arr.length);
//		output = 4 
		String str="India";
		String[]arr=str.split(" ");
		if(arr.length>1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(str.charAt(0)+" and "+str.charAt(str.length()-1));
////			output is first and last element of the string entered
////			o/p= I and A
		}
		
	}
}
