import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// list集合用来保存所有的每一行记录中的学生姓名、ac数目、time
		ArrayList<Student> list = new ArrayList<Student>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		while (sc.hasNext()) {
			String name = sc.next();
			int ac = 0, time = 0;
			// 循环读入n个题目的情况
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				
				
				if (str.charAt(0) <= '0')
					continue;
				ac++;
				int k = str.indexOf('(');
				if (k == -1) {
					time += Integer.parseInt(str);
					continue;
				}
				time += Integer.parseInt(str.substring(0, k))
						+ m
						* Integer.parseInt(str.substring(k + 1,
								str.indexOf(')')));
			}
			// 将每个学生的情况加入到list集合中
			list.add(new Student(name, ac, time));
		}
		// 排序
		Collections.sort(list);
		// 输出
		for (Student stu : list) {
			System.out.printf("%-10s %2d %4d", stu.name, stu.ac, stu.time);
			System.out.println();
		}

	}

}

class Student implements Comparable<Student> {
	public String name;
	public int ac, time;

	public Student(String name, int ac, int time) {
		this.name = name;
		this.ac = ac;
		this.time = time;
	}
	

	public int compareTo(Student o) {
		if (ac > o.ac)
			return -1;
		else if (ac < o.ac)
			return 1;
		if (time > o.time)
			return 1;
		else if (time < o.time)
			return -1;
		return name.compareTo(o.name);
	}

}
