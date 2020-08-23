import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int r = in.nextInt();
			
			System.out.println(Integer.toString(n, r).toUpperCase());
		}

	}

}
