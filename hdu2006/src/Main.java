import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine(); // 输入一行字符
			String[] strs = line.split(" ");
			int length = Integer.parseInt(strs[0]);
			int ans = 1;
			for (int i = 1; i <= length; i++) {
				int j = Integer.parseInt(strs[i]);
				if (j % 2 == 1 || j % 2 == -1) {
					ans *= j;
				}
			}
			out.println(ans); // 输出并换行
			out.flush(); // 在控制台输出，不要忘记这句！

		}

	}

}
