
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals("@")) {
                break;
            }
            int n = sc.nextInt();

            if (flag == false) {
                System.out.println();
            }
            char s[] = str.toCharArray();
            int pos = n;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= pos + i - 1; j++) {
                    if (j == pos + i - 1 || j == pos - i + 1) {
                        System.out.print(s[0]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                System.out.print(s[0]);
            }
            System.out.println();
            flag = false;
        }
    }

}
