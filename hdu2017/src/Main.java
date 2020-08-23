import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(in.nextLine());
		while(length>0){
			String str = in.nextLine();
			int amount = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)>='0' && str.charAt(i)<='9') {
					amount++;
				}
			}
			
			out.println(amount);
			out.flush();
			length--;
		}

	}

}
