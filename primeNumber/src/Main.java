public class Main {

	
	/**
	 * ������˹����ɸ������ư���ɸ����ɸ����Ҫ�õ���Ȼ��n���ڵ�ȫ������������Ѳ����� ����n �����������ı����޳���ʣ�µľ���������
	 * ���磺����Ҫɸ��ֵ�ķ�Χn���ҳ����ڵ�������
	 * �ⷨ������2ȥɸ������2���£���2�ı����޳�����������һ��������Ҳ����3ɸ����3���£���3�ı����޳���
	 * ������ȥ����һ������5ɸ����5���£���5�ı����޳����������ظ���ȥ......��
	 * 
	 * ʱ�临�Ӷȣ�O(nloglogn)
	 */
	private static void Eratosthenes(int n) {

		// Ĭ����false
		boolean[] no_prime = new boolean[n + 5];

		for (int i = 2; i * i <= n; i++) {

			//���ж�֮ǰ�ǲ����Ѿ�ɾ������
			if (no_prime[i]) {
				continue;
			}
			
			// ����ֱ�Ӻ�����С��i�ı�����֮ǰ�Ѿ��������
			for (int j = i * i; j <= n; j += i) {
				no_prime[j] = true;
			}
		}
	}

	public static void main(String[] args) {
		Eratosthenes(1000);

	}

}
