import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int length = in.nextInt();

		if(length == 0){
			out.println("NO");
			out.flush();
		}
		while (length > 0) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			
			if(a+b>c&&a+c>b&&b+c>a){
				out.println("YES");
			}else{
				out.println("NO");
			}
			out.flush();
			length--;
		}

	}

}
