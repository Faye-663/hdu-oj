import java.util.Scanner;
//数位dp

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n==0&&m==0){
				break;
			}
			
			int ans = 0;
			for(int i = n;i<=m;i++){
				String str = Integer.toString(i);
				boolean is4 = str.contains("4");
				if(is4){
					continue;
				}
				boolean is62 = str.contains("62");
				
				if(!is62){
					ans++;
				}
				
			}
			System.out.println(ans);
			
		}

	}

}
