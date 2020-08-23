import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			int day = in.nextInt();
			int number = 1;
			for(int i = 1;i<day;i++){
				number = (number+1)*2;
			}
			
			out.println(number);
			out.flush();
		}

	}

}
