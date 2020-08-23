import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// list���������������е�ÿһ�м�¼�е�ѧ��������ac��Ŀ��time
		ArrayList<Student> list = new ArrayList<Student>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		while (sc.hasNext()) {
			String name = sc.next();
			int ac = 0, time = 0;
			// ѭ������n����Ŀ�����
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
			// ��ÿ��ѧ����������뵽list������
			list.add(new Student(name, ac, time));
		}
		// ����
		Collections.sort(list);
		// ���
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
