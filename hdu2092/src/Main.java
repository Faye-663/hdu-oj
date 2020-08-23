import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			
			if(n==0&&m==0){
				break;
			}
			
			int s = n*n-4*m;
			if(s<0){
				System.out.println("No");
				continue;
			}
			
			double s1 = Math.sqrt(s);
			int s11 = (int)s1;
			if(s1-s11!=0){
				System.out.println("No");
				continue;
			}
			
			if(((n+s1)%2!=0)||(n-s1)%2!=0){
				System.out.println("No");
				continue;
			}
			System.out.println("Yes");
		}

	}

}
