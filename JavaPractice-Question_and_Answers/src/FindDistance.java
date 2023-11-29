
public class FindDistance {

	public static int findDistance(int x1, int y1, int x2, int y2) {
		
		double  dist=0;
		int temp = ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		dist=Math.sqrt(temp);
		int d=(int) Math.round(dist);
		return d;
	}
}
