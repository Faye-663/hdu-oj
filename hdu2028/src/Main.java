import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		while (in.hasNext()) {
			int number = in.nextInt();

			int[] nums = new int[number];

			for (int i = 0; i < number; i++) {
				nums[i] = in.nextInt();
			}
			Arrays.sort(nums);
			int max = nums[nums.length-1];

			for (int i = 1;; i++) {
				boolean flag = true;
				for (int j = 0; j < nums.length; j++) {
					if (i*max % nums[j] != 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					out.println(i*max);
					out.flush();
					break;
				}
			}
		}

	}

}
