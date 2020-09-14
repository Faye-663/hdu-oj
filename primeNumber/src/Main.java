public class Main {

	
	/**
	 * 埃拉托斯特尼筛法（简称埃氏筛或爱氏筛）：要得到自然数n以内的全部素数，必须把不大于 根号n 的所有素数的倍数剔除，剩下的就是素数。
	 * 例如：给出要筛数值的范围n，找出以内的素数。
	 * 解法：先用2去筛，即把2留下，把2的倍数剔除掉；再用下一个质数，也就是3筛，把3留下，把3的倍数剔除掉
	 * ；接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；不断重复下去......。
	 * 
	 * 时间复杂度：O(nloglogn)
	 */
	private static void Eratosthenes(int n) {

		// 默认是false
		boolean[] no_prime = new boolean[n + 5];

		for (int i = 2; i * i <= n; i++) {

			//先判断之前是不是已经删除过了
			if (no_prime[i]) {
				continue;
			}
			
			// 这里直接忽略了小于i的倍数，之前已经处理过了
			for (int j = i * i; j <= n; j += i) {
				no_prime[j] = true;
			}
		}
	}

	public static void main(String[] args) {
		Eratosthenes(1000);

	}

}
