import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		while(num>0){
			
			String[] a = in.nextLine().split(" ");
			int x = Integer.parseInt(a[0])+Integer.parseInt(a[3]);
			int y = Integer.parseInt(a[1])+Integer.parseInt(a[4]);
			int z = Integer.parseInt(a[2])+Integer.parseInt(a[5]);
			
			if(z>60){
				z-=60;
				y+=1;
			}
			if(y>60){
				y-=60;
				x+=1;
			}
			System.out.println(x+" "+y+" "+z);
			
			num--;
		}
	}

}
