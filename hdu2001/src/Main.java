import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine(); // ����һ���ַ�
			String[] strs = line.split(" ");
			double x1 = Double.valueOf(strs[0]);
			double y1 = Double.valueOf(strs[1]);
			double x2 = Double.valueOf(strs[2]);
			double y2 = Double.valueOf(strs[3]);
			double s = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			if(s == 0){
				out.println("0.00"); // ���������
				out.flush(); // �ڿ���̨�������Ҫ������䣡
				continue;
			}
			String str = String.format("%.2f", s);
			out.println(str); // ���������
			out.flush(); // �ڿ���̨�������Ҫ������䣡
		}
	}

}
