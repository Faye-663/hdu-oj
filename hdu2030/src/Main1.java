import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			while (n-- > 0) {
				String s = sc.nextLine();
				int num = 0;
				byte b[] = s.getBytes();// ���ַ���ת��Ϊ�ֽ�����
				for (int i = 0; i < b.length; i++) {
					/*���ֻ������ڼ�����ı�﷽ʽ�������ǣ�ʹ�ö����ֽڣ�ÿ���ֽ����λһλΪ1��
					 * ������У� �����һλ�Ƿ���λ�� 1 ��ʾΪ���������Ժ��ֻ������ÿ���ֽڱ�ʾ��ʮ���������Ǹ�����
					 * ��Ϊ����ռ�������ֽڣ����Խ��Ҫ����2��*/
					if (b[i] < 0) {
						System.out.println(b[i]);
						num++;
					}
				}
				System.out.println(num / 2);
			}
		}
	}
}
