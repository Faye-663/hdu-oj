import java.util.ArrayList;
import java.util.Scanner;



//WA
public class Main {
	
	public static void main(String[] args) {

		boolean[] no_prime = new boolean[10005];
		for (int i = 2; i * i <= 10000; i++) {
			for (int j = i * i; j <= 10000; j += i) {
				no_prime[j] = true;
			}
		}
		
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			if (a == 0) {
				break;
			}

			ArrayList<Integer> sushu = new ArrayList<Integer>();

			sushu.add(2);
			for (int i = 3; i <= 10000; i++) {
				boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					sushu.add(i);
				}
			}

			int sum = 0;
			for (int i = 0; i < a/2; i++) {
				for (int j = i + 1; j < a; j++) {
					if (sushu.get(i) + sushu.get(j) == a) {
						sum++;
					}
				}
			}

			System.out.println(sum);
		}

	}

}




