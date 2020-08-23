import java.util.Scanner;

//ԭʼ��ŵ������
/**
 * ���Ҫ֪��X��Բ�̴ӳ�λ�õ�ĩλ�ã���Ҳ���Էֳ�����
 * �ѳ�������X-1��Բ���ƶ����м�λ��
 * ������Բ���ƶ���ĩλ��
 * ��֮ǰ��X-1��Բ���ƶ���ĩλ��
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
