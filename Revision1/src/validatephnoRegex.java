import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validatephnoRegex {
	public static boolean buggyIsValidPhoneNumber(String phoneNumber) {
//	        ^ indicates start
//		$ indicate end
//		there should only be 10 elements  and it should all be numbers from 0 -9
//		or
//		there should only be 3 elements and it should all be numbers from 0 -9
//			there should only be 3 elements and it should all be numbers from 0 -9
//			there should only be 4 elements and it should all be numbers from 0 -9
		
	        Pattern pattern = Pattern.compile("^([0-9]{10}|[0-9]{3}-[0-9]{3}-[0-9]{4})$");
	        Matcher matcher = pattern.matcher(phoneNumber);
	        return matcher.matches();
	    }
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	    
	        String phoneNumber = scan.nextLine();
	    
	        boolean result = buggyIsValidPhoneNumber(phoneNumber);
	    
	        System.out.println(result? "true": "false");
	    }
	}

