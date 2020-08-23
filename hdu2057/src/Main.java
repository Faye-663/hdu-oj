import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String a = in.next();
			String b = in.next();
			Long i = Long.parseLong(a.replaceAll("\\+", ""), 16);
			Long j = Long.parseLong(b.replaceAll("\\+", ""), 16);
			i += j;
			if (i < 0)
				out.println("-" + Long.toHexString(-i).toUpperCase());
			else
				out.println(Long.toHexString(i).toUpperCase());
			out.flush();
		}

	}

}
