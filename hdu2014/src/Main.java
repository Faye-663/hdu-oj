import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			int number = in.nextInt();
			int[] scores = new int[number];
			for(int i = 0;i<number;i++){
				scores[i] = in.nextInt();
			}
			
			Arrays.sort(scores);
			
			double ans = 0;
			for(int i = 1;i<number-1;i++){
				ans += scores[i];
			}
			
			ans = ans/(number-2);
			
			out.println(String.format("%.2f", ans));
			out.flush();
		}

	}

}
