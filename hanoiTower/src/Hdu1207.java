import java.util.Scanner;



/**�Ƚ�����������k��С�̣����ڵ��ĸ������ϣ�
 * ʣ�µĴ��̲��ܸ�����С���ϣ����վ��人ŵ������������Ŀ�����ϣ�
 * ����k��С�̸����ڴ�����
 * ����F��n��=F(k)+ Math.pow(2, n-k)-1 + F(k)
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
