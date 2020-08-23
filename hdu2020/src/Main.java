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
			int temp;
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length - 1 - i; j++) {
					if (Math.abs(nums[j + 1]) > Math.abs(nums[j])) {
						temp = nums[j + 1];
						nums[j + 1] = nums[j];
						nums[j] = temp;
					}
				}
			}
			for (int i = 0; i < nums.length - 1; i++) {
				out.print(nums[i] + " ");
			}
			out.println(nums[nums.length - 1]);
			out.flush();

		}
	}

}
