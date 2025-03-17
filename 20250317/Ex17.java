package com.pm;

import java.util.Scanner;

class Student{
	int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(int num) {this.num=num;}
	public void setKor(String kor) {this.kor=Integer.parseInt(kor);}	
	public void seteng(String eng) {this.eng=Integer.parseInt(eng);}
	public void setmath(String math) {this.math=Integer.parseInt(math);}
	public int tot() {return kor+eng+math;}
	public double avg() {return tot()*100/3/100.0;}
}

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л��������� ���α׷�(ver 0.8.0)");
		String input = null;
		System.out.print("�ѿ�> ");
		Student[] data = new Student[Integer.parseInt(sc.nextLine())];
		int cnt = 0;
		while (true) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����> ");
			input = sc.nextLine();
			// ����
			if (input.equals("0")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}

			// ����
			if (input.equals("1")) {
				System.out.println("------------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���\t");
				System.out.println("------------------------------------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor + "\t" + stu.eng + "\t" + stu.math
							+ "\t" + stu.tot() + "\t" + stu.avg() + "\t");
				}
			}

			// �Է�
			if (input.equals("2") && cnt < data.length) {
				Student stu = new Student(202500 + cnt);
				System.out.print("�̸�> ");
				stu.name = sc.nextLine();
				System.out.print("����> ");
				input = sc.nextLine();
				stu.setKor(input);
				System.out.print("����> ");
				input = sc.nextLine();
				stu.seteng(input);
				System.out.print("����> ");
				input = sc.nextLine();
				stu.setmath(input);
				data[cnt++] = stu;
			}
			// ����
			if (input.equals("3")) {
				System.out.print("������ ������ �л��� �й��� �Է��ϼ���> ");
				
				System.out.println("������ �����Ǿ����ϴ�.");
				
				
				
				
				
			}
			// ����
			if (input.equals("4")) {
				System.out.print("������ ������ �л��� �й��� �Է��ϼ���> ");
				int delid = sc.nextInt();
				if (delid > 0 && delid <= cnt) {
					for (int i = delid - 1; i < cnt - 1; i++) {
						data[i] = data[i + 1];
					}
					data[cnt - 1] = null;
					cnt--;
					System.out.println("������ ���� �Ǿ����ϴ�.");
				} else {
					System.out.println("�߸��� �й��Դϴ�.");
				}
			}

		}
	}//main end

}//end
