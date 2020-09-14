import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			while (n-- > 0) {
				String s = sc.nextLine();
				int num = 0;
				byte b[] = s.getBytes();// 将字符串转化为字节数组
				for (int i = 0; i < b.length; i++) {
					/*汉字机内码在计算机的表达方式的描述是，使用二个字节，每个字节最高位一位为1。
					 * 计算机中， 补码第一位是符号位， 1 表示为负数，所以汉字机内码的每个字节表示的十进制数都是负数。
					 * 因为汉字占用两个字节，所以结果要除以2。*/
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
