import java.util.Scanner;


/**�Ȱ�n-1���ᵽb,�������������İᵽC���ٰ�n-1����B��C��
 * ����Ҫ���ac[n]��bc[n]��
 * ����Ʒ��̣�bc[n]=bc[n-1]+1+ac[n-1]��bc[n]���̺�ab[n]һ����
 * �ܷ���ans[n]=2*bc[n-1]+2.
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
