import java.util.Scanner;



/**先将上面连续的k个小盘，放在第四根柱子上，
 * 剩下的大盘不能覆盖在小盘上，则按照经典汉诺塔问题排列在目标柱上，
 * 最后把k个小盘覆盖在大盘上
 * 即：F（n）=F(k)+ Math.pow(2, n-k)-1 + F(k)
 */
public class Hdu1207 {
	
	public static int arr[] = new int[65];

	public static void hanoi(int n) {
		arr[1] = 1;
		for (int i = 2; i < 65; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 1; j < i; j++) {
				int temp = (int) (2 * arr[j] + Math.pow(2.0, i - j) - 1);
				min = Math.min(temp,min);
			}
			arr[i] = min;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		hanoi(64);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}

}
