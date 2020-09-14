import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.hasNext()) {
			String line = in.nextLine(); // 输入一行字符
			String[] strs = line.split("/");
			int year = Integer.parseInt(strs[0]);
			int month = Integer.parseInt(strs[1]);
			int day = Integer.parseInt(strs[2]);

			boolean isRun = false;

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				isRun = true;
			}

			switch (month) {
			case 1:
				out.println(day); 
				out.flush();
				break;
			case 2:
				out.println(day+31);
				out.flush();
				break;
			case 3:
				if(isRun == true){
					out.println(day+60);
				}else{
					out.println(day+59);
				}
				out.flush();
				break;
			case 4:
				if(isRun == true){
					out.println(day+91);
				}else{
					out.println(day+90);
				}
				out.flush();
				break;
			case 5:
				if(isRun == true){
					out.println(day+121);
				}else{
					out.println(day+120);
				}
				out.flush();
				break;
			case 6:
				if(isRun == true){
					out.println(day+152);
				}else{
					out.println(day+151);
				}
				out.flush();
				break;
			case 7:
				if(isRun == true){
					out.println(day+182);
				}else{
					out.println(day+181);
				}
				out.flush();
				break;
			case 8:
				if(isRun == true){
					out.println(day+213);
				}else{
					out.println(day+212);
				}
				out.flush();
				break;
			case 9:
				if(isRun == true){
					out.println(day+244);
				}else{
					out.println(day+243);
				}
				out.flush();
				break;
			case 10:
				if(isRun == true){
					out.println(day+274);
				}else{
					out.println(day+273);
				}
				out.flush();
				break;
			case 11:
				if(isRun == true){
					out.println(day+305);
				}else{
					out.println(day+304);
				}
				out.flush();
				break;
			case 12:
				if(isRun == true){
					out.println(day+335);
				}else{
					out.println(day+334);
				}
				out.flush();
				break;
			}
		}

	}

}
