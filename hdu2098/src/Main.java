import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		boolean[] no_prime = new boolean[10005];
		for (int i = 2; i * i <= 10000; i++) {
			for (int j = i * i; j <= 10000; j += i) {
				no_prime[j] = true;
			}
		}
		no_prime[0] = no_prime[1] = true;
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			if (a == 0) {
				break;
			}

			int sum = 0;
			for (int i = 2; i < a/2; i++) {
				if((no_prime[i]==false) &&(no_prime[a-i] == false)){
					sum++;
				}
			}

			System.out.println(sum);
		}

	}

}




