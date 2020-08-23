import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int[] nums = new int[n];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = in.nextInt();
			}
			
			int[] number = new int[n];			
			
			for(int i = 0;i<n;i++){
				int salary = nums[i];
				
				number[i] += salary/100;
				salary = salary-100*(salary/100);
				
				number[i] += salary/50;
				salary = salary-50*(salary/50);
				
				number[i] += salary/10;
				salary = salary-10*(salary/10);
				
				number[i] += salary/5;
				salary = salary-5*(salary/5);
				
				number[i] += salary/2;
				salary = salary-2*(salary/2);
				
				number[i] += salary/1;
			}
			
			int ans = 0;
			for(int i:number){
				ans+=i;
			}
			
			out.println(ans);
			out.flush();
		}
	}

}
