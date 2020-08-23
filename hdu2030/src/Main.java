import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(in.nextLine());
		
		for(int i =0;i<num;i++){
			String str = in.nextLine();
			int ans=0;
			
			for(int j = 0;j<str.length();j++){
				if((int)str.charAt(j)>127){//ºº×ÖASCiiÂë > 127
					ans++;
				}
			}
			out.println(ans);
			out.flush();
		}

	}
	

}
