import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine(); // ����һ���ַ�
			String[] strs = line.split(" ");
			int length = Integer.parseInt(strs[1]);

			double ans = Double.valueOf(strs[0]);
			double k = Double.valueOf(strs[0]);

			if (k == 0 || length == 0) {
				out.println("0.00");
				out.flush();
				continue;
			}

			for (int i = 1; i < length; i++) {

				double j = Math.sqrt(k);
				ans += j;
				k = j;

			}
			DecimalFormat decimalFormat = new DecimalFormat(".00");
			out.println(decimalFormat.format(ans)); // ���������
			out.flush(); // �ڿ���̨�������Ҫ������䣡
		}

	}
}
