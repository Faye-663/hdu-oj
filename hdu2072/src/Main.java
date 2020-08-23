import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine();
			if("#".equals(line)){
				break;
			}
			String[] strs = line.split(" +");
			
			Set<String> set = new HashSet<String>();
			for(int i=0;i<strs.length;i++){
				set.add(strs[i]);
			}
			if(set.isEmpty()) {
                out.println("0");
                out.flush();
                continue;
            }

            int c=0;
            if(line.charAt(0)==' ') {
                c=set.size()-1;

            }
            else {
                c=set.size();
            }
            out.println(c);
            set.clear();
			out.flush();
		}

	}

}
