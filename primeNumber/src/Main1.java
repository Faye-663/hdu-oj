import java.util.Arrays;

/**
 * ������˹����ɸ�� VS ŷ��ɸ�������Ż���
 * 
 * @author TinyDolphin
 *
 */
public class Main1 {

    private static final int MAX_LENGTH_CHECK = 100000000;          // ��
    private static final int MAX_LENGTH_PRIMELIST = 10000000;       // ǧ��

    private static boolean[] check = new boolean[MAX_LENGTH_CHECK]; // �洢���
    private static int[] primeList = new int[MAX_LENGTH_PRIMELIST]; // �洢����

    /**
     * ������˹����ɸ������ư���ɸ����ɸ����Ҫ�õ���Ȼ��n���ڵ�ȫ������������Ѳ����� ����n �����������ı����޳���ʣ�µľ���������
     * ���磺����Ҫɸ��ֵ�ķ�Χn���ҳ����ڵ�������
     * �ⷨ������2ȥɸ������2���£���2�ı����޳�����������һ��������Ҳ����3ɸ����3���£���3�ı����޳���������ȥ����һ������5ɸ����5���£���5�ı����޳����������ظ���ȥ......��
     * 
     * ʱ�临�Ӷȣ�O(nloglogn) 
     * ����֮����6 �� indexI = 2 ʱ����ǣ����� indexI = 3 ʱ���ֱ������һ�Ρ������ظ���ǣ����Ż��ռ�
     */
    private static void Eratosthenes(int num) {
        int count = 0;
        for (int indexI = 2; indexI <= num; indexI++) {
            // �� indexI ���Ǳ��޳�����ʱ���� indexI ����
            if (!check[indexI]) {
                primeList[count++] = indexI;
            }
            // �޳� indexI �ı���
            for (int indexJ = indexI + indexI; indexJ <= num; indexJ += indexI) {
                check[indexJ] = true;
            }
        }
    }

    /**
     * ŷ��ɸ������֤ÿ������ֻ�ᱻ������С������ɸ����ʱ�临�ӶȽ��͵�O(n)�� 
     * ÿһ������ȥ���Ե�ǰ�������������е������� indexI �Ǻ������� indexI % primeList[indexJ] == 0 ʱ��ֻ�ܳ��Ե�һ������ 2
     */
    private static void Euler(int num) {
        int count = 0;
        for (int indexI = 2; indexI <= num; indexI++) {
            if (!check[indexI]) {
                primeList[count++] = indexI;
            }
            // ÿһ������ȥ���Ե�ǰ�������������е�������� indexI �Ǻ������� indexI % primeList[indexJ] == 0����ô��ֻ�ܳ��Ե�һ������ 2
            // �磺2��2��3��(2��3)��4��(2)��5��(2��3��5)��6��(2)��7��(2��3��5��7)��8��(2)��9��(2��3)��10��(2)
            for (int indexJ = 0; indexJ < count; indexJ++) {
                // �����ʱ������
                if (indexI * primeList[indexJ] > num) {
                    break;
                }
                check[indexI * primeList[indexJ]] = true;
                // ��� indexI ��һ������������ indexI % primeList[indexJ] == 0
                // ��֤��ÿ������ֻ�ᱻ������С������ɸ��
                if (indexI % primeList[indexJ] == 0) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 100000; // ʮ��
        long start = System.currentTimeMillis();
        Eratosthenes(n);
        long end = System.currentTimeMillis();
        System.out.println("ʮ�򼶱�����������ɸ����ʱ��" + (end - start) + " ms");

        Arrays.fill(check, false);
        Arrays.fill(primeList, 0);

        start = System.currentTimeMillis();
        Euler(n);
        end = System.currentTimeMillis();
        System.out.println("ʮ�򼶱�������ŷ��ɸ������ʱ��" + (end - start) + " ms");
    }

}