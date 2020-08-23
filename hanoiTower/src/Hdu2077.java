import java.util.Scanner;


/**先把n-1个搬到b,再用俩步把最大的搬到C，再把n-1个从B到C。
 * 所以要求出ac[n]和bc[n]，
 * 其递推方程：bc[n]=bc[n-1]+1+ac[n-1]，bc[n]方程和ab[n]一样。
 * 总方程ans[n]=2*bc[n-1]+2.
 */

public class Hdu2077 {

	public static long ac[]=new long [36];
	public static long bc[]=new long [36];
	public static void hanoi(int n){
		ac[1]=2;
		bc[1] = 1;
		for(int i=2;i<36;i++){
			ac[i]=3*ac[i-1]+2;
	        bc[i]=bc[i-1]+ac[i-1]+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		hanoi(36);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			System.out.println(2*bc[n-1]+2);
		}
	}

}
