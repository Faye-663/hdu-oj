import java.util.Scanner;

//原始汉诺塔问题
/**
 * 如果要知道X个圆盘从初位置到末位置，则也可以分成三步
 * 把除了最大的X-1个圆盘移动到中间位置
 * 把最大的圆盘移动到末位置
 * 把之前的X-1个圆盘移动到末位置
 */
public class HanoiOne {

	private static int hanoi(int n) {
		if (n == 1) {
			return 1;
		} else {
			return hanoi(n - 1) + 1 + hanoi(n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}

			int ans = hanoi(n);
			System.out.println(ans);
		}

	}

}
