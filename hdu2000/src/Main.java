import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine(); // ����һ���ַ�
			char[] c = line.toCharArray();
			Arrays.sort(c);
			out.println(c[0] + " " + c[1] + " " + c[2]); // ���������
			out.flush(); // �ڿ���̨�������Ҫ������䣡
		}

	}

}