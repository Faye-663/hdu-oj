import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(in.hasNext()){
			int num = in.nextInt();
			
			if(num==1){
				out.println(1);
				out.println();
				out.flush();
				continue;
			}else if(num==2){
				out.println(1);
				out.println(1+" "+1);
				out.println();
				out.flush();
				continue;
			}
			ArrayList<int[]> aaa= new ArrayList();
			
			int[] b ={1};
			int[]c={1,1};
			aaa.add(b);
			aaa.add(c);
			
			for(int i = 2;i<num;i++){
				int[] temp = new int[i+1];
				temp[0]=1;
				temp[i]=1;
				for(int j=1;j<i;j++){
					int[] qqq = aaa.get(i-1);
					temp[j]=qqq[j]+qqq[j-1];
				}
				aaa.add(temp);
			}
			
			for(int i=0;i<aaa.size();i++){
				int []bbb=aaa.get(i);
				for(int j=0;j<bbb.length-1;j++){
					out.print(bbb[j]+" ");
				}
				out.println(bbb[bbb.length-1]);
			}
			out.println();
			out.flush();
			
		}

	}

}
