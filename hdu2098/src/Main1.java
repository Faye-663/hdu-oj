import java.util.Scanner;

//AC
public class Main1 {
	
	static boolean[] no_prime = new boolean[10005];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		while ((n = sc.nextInt()) != 0) {
			int cnt = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (!no_prime[i] && !no_prime[n - i] && i != n - i){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	
	static void init() {
		for (int i = 2; i * i <= 10000; i++) {
			for (int j = i * i; j <= 10000; j += i) {
				no_prime[j] = true;
			}
		}
	}

}
