import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			int m = in.nextInt();
			int n = in.nextInt();

			int[] ans = new int[3];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					int temp = in.nextInt();
					if (Math.abs(temp) > Math.abs(ans[2])) {
						ans[0] = i + 1;
						ans[1] = j + 1;
						ans[2] = temp;
					}
				}
			}

			out.println(ans[0] + " " + ans[1] + " " + ans[2]);
			out.flush();
		}
	}

}
