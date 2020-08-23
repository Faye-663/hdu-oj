import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int a = in.nextInt() * 100;
			int b = in.nextInt();
			if (a == b && b == 0) {
				break;
			}
			int c = -a % b;
			while (c < 100) {
				if (c < 0) {
					c += b;
				}
				if (c + b < 100) {
					System.out.printf("%02d ", c);
				} else {
					System.out.printf("%02d", c);
				}

				c += b;
			}
			System.out.println();
		}
	}

}
