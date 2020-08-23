import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		int length = in.nextInt();

		while (length > 0) {
			int i = in.nextInt();
			double ans = dxs(i);
			out.println(String.format("%.2f", ans));
			out.flush();
			length--;
		}

	}

	public static double dxs(int n) {
		boolean flag = true;
		double ans = 0;
		for (int i = 1; i <= n; i++) {
			if (flag == true) {
				ans += 1.0 / i;
				flag = !flag;
			} else {
				ans += -1.0 / i;
				flag = !flag;
			}
		}
		return ans;
	}

}
