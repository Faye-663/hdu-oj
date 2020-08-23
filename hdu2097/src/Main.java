import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int a = in.nextInt();
			if(a == 0){
				break;
			}
			
			String s = Integer.toString(a);
			int sum = 0;
			for(int i = 0;i<s.length();i++){
				sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
			}
			
			
			String s1 = Integer.toString(a, 16);
			long sum1 = 0L;
			for(int i = 0;i<s1.length();i++){
				sum1+=Long.valueOf(String.valueOf(s1.charAt(i)),16);
			}
			int ans = Integer.valueOf(String.valueOf(sum1), 10);
			
			
			String s2 = Integer.toString(a, 12);
			long sum2 = 0L;
			for(int i = 0;i<s2.length();i++){
				sum2+=Long.valueOf(String.valueOf(s2.charAt(i)),12);
			}
			int ans1 = Integer.valueOf(String.valueOf(sum2), 10);
			
			
			if(sum == ans&&sum==ans1){
				System.out.println(a+" is a Sky Number.");
			}else{
				System.out.println(a+" is not a Sky Number.");
			}
		}

	}

}
