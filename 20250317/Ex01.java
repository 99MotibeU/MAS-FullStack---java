package com.am;

import java.util.Scanner;

class Student {
	int id;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

//������
	public Student(int id, int kor, int eng, int math) {
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total();
		avg();
	}
	
	public int getId() {return id;}
	public int getKorean() {return kor;}
	public int getEnglish() {return eng;}
	public int getMath() {return math;}
	public int getTotal() {return total;}
	public double getavg() {return avg;}
	public void total() {
		this.total = kor + eng + math;
	}
	public void avg() {
		this.avg = Math.round(total / 3.0 * 100) / 100.0;
	}
	
	public String toString() {
		return id + "\t|" + kor + "\t|" + eng + "\t|" + math + "\t|" + total + "\t|" + avg + "\t\r\n";
	}
	//���� ���� �޼���
	public void updateScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total();
		avg();
	}
}//student end

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * �л��������� ���α׷�(0.7.0) - �迭, string, ��ü 1.���� 2.�Է� 3.���� 4.���� 0.���� ���Ἲ(0~100) �����Ҵ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� ���� ���� ���α׷� ver 0.7.0");
		Student[] students = new Student[500]; // �л� ������ ������ �迭
		int studentCount = 0; // �л���
		String menu = "1.�Է� 2.��� 3.���� 4.���� 0.����> ";
		boolean boo = true;
		while (boo) {
			System.out.print(menu);
			int choice = sc.nextInt();
			switch (choice) {

			case 0:
				// ����
				System.out.println("�̿����ּż� �����մϴ�\t���α׷��� �����մϴ�");
				boo = false;
				sc.close();
				break;
			case 1:
				// ����
				System.out.print("����> ");
				int kor = sc.nextInt();
				System.out.print("����> ");
				int eng = sc.nextInt();
				System.out.print("����> ");
				int math = sc.nextInt();

				if (kor > 100 || eng > 100 || math > 100) {
					System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �޴��� ���ư��ϴ�.");
				} else {
					Student newStudent = new Student(studentCount + 1, kor, eng, math);
					students[studentCount++] = newStudent; // �迭�� �л� ���� �߰�
					System.out.println("�л� ������ �ԷµǾ����ϴ�.");
				}
				System.out.println();
				break;
			case 2:
				// �Է�
				System.out.println("�й�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("----------------------------------------------------");
				for (int i = 0; i < studentCount; i++) {
					System.out.print(students[i]);
				}
				break;
//			case 3:
//				// ����
//              break; 
//			case 4:
//				// ����
//				break;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}// main end
}// end
