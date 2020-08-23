import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int number = in.nextInt();

			int[] nums = new int[number];

			for (int i = 0; i < number; i++) {
				nums[i] = in.nextInt();
			}
			Arrays.sort(nums);

			int ans = 0;
			for (int i = nums.length - 1; i > 0; i--) {
				int temp = aaa(nums[i], nums[i - 1]);
				nums[i-1] = temp;
				if (ans < temp) {
					ans = temp;
				}
			}

			System.out.println(ans);
		}

	}

	public static int aaa(int a, int b) {
		int w = a * b;
		if (a < b) {
			int q = b;
			b = a;
			a = q;
		}

		while (b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return w / a;
	}

}
