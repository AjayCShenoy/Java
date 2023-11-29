import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CandyCrush {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>scores=new ArrayList<>(Arrays.asList(21,124,235,46,58,576,234,124,56,67,34,46,23,876,45));
		System.out.println(scores);
		Collections.sort(scores);
		List<Integer>Highscores=scores.subList(scores.size()-10, scores.size());
		Collections.reverse(Highscores);
		System.out.println("Leaderboard");
		System.out.println(Highscores);
		System.out.println("Do you want to add new score Y:N");
		String s=sc.next();
		if(s.equals("Y"))
		{
		int newscore=sc.nextInt();
		scores.add(newscore);
		Collections.sort(scores);
		Highscores=scores.subList(scores.size()-10, scores.size());
		Collections.reverse(Highscores);
		System.out.println("Leaderboard");
		System.out.println(Highscores);
		}
	}
}

