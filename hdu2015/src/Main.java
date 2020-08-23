import java.awt.List;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			int number = in.nextInt();
			int length = in.nextInt();
			int len = (int) Math.ceil(number*1.0/length);
			int index = 0;
			
			ArrayList<Integer> anss = new ArrayList();

			int[] ints = new int[number];
			ints[0] = 2;
			for (int i = 1; i < number; i++) {
				ints[i] = i * 2 + 2;
			}

			while(len>0){
				int ans = 0;
				for (int i = 0; i < length && i < number; i++) {
					ans = ans + ints[index + i];
				}
				anss.add(ans/Math.min(length, number));
				index = index + length;
				number = number - length;
				len--;
			}
			for(int i =0;i<anss.size()-1;i++){
				out.print(anss.get(i)+" ");
			}
			out.println(anss.get(anss.size()-1));
			out.flush();
		}

	}


}
