import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		while (in.hasNext()) {
			int year = in.nextInt();
			if (year == 0) {
				break;
			}

			ArrayList<Integer> cows = new ArrayList();
			cows.add(1);

			for (int i = 1; i < year; i++) {
				for (int j = 0; j < cows.size(); j++) {
					int aaa = cows.get(j);
					if (aaa >= 0) {
						cows.add(-3);
					}
					cows.set(j, aaa + 1);
				}
			}

			int number = 0;
			for (int cow : cows) {
				if (cow > 0) {
					number += cow;
				}
			}
			out.println(number);
			out.flush();

		}

	}
}
