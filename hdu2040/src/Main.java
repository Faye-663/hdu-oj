import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int number = in.nextInt();
		
		while(number>0){
			int a = in.nextInt();
			int b =in.nextInt();
			
			int aa = 0;
			for(int i = 1;i<a;i++){
				if(a%i==0){
					aa+=i;
				}
			}
			
			if(aa!=b){
				out.println("NO");
				out.flush();
				number--;
				continue;
			}
			int bb =0;
			for(int i = 1;i<b;i++){
				if(b%i==0){
					bb+=i;
				}
			}
			if(bb==a){
				out.println("YES");
				out.flush();
				number--;
				continue;
			}else{
				out.println("NO");
				out.flush();
				number--;
			}
		}

	}

}
