import java.util.Scanner;

/**
 * 将n-1个圆盘移动到目标盘
 * 将最大盘移动到中间盘
 * 将n-1个圆盘移动到初始盘
 * 将最大盘移动到目标盘
 * 将n-1个圆盘移动到目标盘
 */
public class Hdu2064 {

	public static long arr[] = new long[36];

	public static void hanoi(int n) {
		arr[1] = 2;
		for (int i = 2; i < 36; i++) {
			arr[i] = 3 * arr[i - 1] + 2;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		hanoi(36);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(arr[n]);
		}
	}

}
