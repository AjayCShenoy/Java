
public class ColorCode {

	public static int getColorcode(String str) {
		
		if(str.matches("[#]{1}[A-F0-9]{6}"))
			return 1;
		else 	
		return -1;
		
	}

}
