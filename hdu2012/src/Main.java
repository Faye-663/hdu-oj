import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while (in.hasNext()) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			if(x==0&&y==0){
				break;
			}
			
			boolean flag = true;
			
			for(int i = x;i<=y;i++){
				int ans = i*i+i+41;
				for(int j = 2;j<ans;j++){
					if(ans%j == 0){
						flag = false;
						break;
					}
				}
				
				if(flag == false){
					break;
				}
			}
			
			if(flag == true){
				out.println("OK");
			}else{
				out.println("Sorry");
			}
			out.flush();
			
			
		}
		
	}

}
