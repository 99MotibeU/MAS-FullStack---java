package com.pm;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Q1.	 *
		// 		**
		// 	   ***
		//    ****
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// Q2. A
		//     BC
		//     DEF
		//     GHIJ
		
		
		
		// Q3. 1234
		//      567
		//       89
		//        0
		int a = 1;
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		System.out.println();
		// Q4. ���������� ���弼��
		// --------------------------
		// mas ������
		// --------------------------
		// ��ǰ �ܰ� ���� �ݾ�
		// --------------------------
		// �����깰 1000 1 1000
		// �ڰ�ġ 1200 2 2400
		// ���� 500 3 1500
		// --------------------------
		// �հ� 4900
		// console bat��

		// Q5.
		// ---------------------------
		// ���� ���� �� ����(ver 0.1.0)
		// ---------------------------
		// ����(1),����(2),��(3),����(0)>1
		// ����� ����
		// ��ǻ�ʹ� ����
		// �����ϴ�.

		// ����(1),����(2),��(3),����(0)>1
		// ����� ����
		// ��ǻ�ʹ� ��
		// �̰���ϴ�.

		// ����(1),����(2),��(3),����(0)>0
		// ���� �·�
		// 1�� 0�� 1��
		// �̿��� �ּż� �����մϴ�.

		System.out.println("---------------------------");
		System.out.println("���� ���� �� ����(ver 0.1.0)");
		System.out.println("---------------------------");
		String menu = "����(1),����(2),��(3),����(0)>";
		// while(true) {
		while (true) {
			int count = 0;
			Scanner sc = new Scanner(System.in);
			String win = "�̰���ϴ�.";
			String lose = "�����ϴ�.";
			int g = sc.nextInt();
			int c = (int) ((Math.random() * 3) + 1);
			//���(�Է�)
			if (g == 1) {
				System.out.println("����� ����");
			} else if (g == 2) {
				System.out.println("����� ����");
			} else {
				System.out.println("����� ��");
			}
			//��ǻ��
			if (c == 1) {
				System.out.println("��ǻ�ʹ� ����");
			} else if (c == 2) {
				System.out.println("��ǻ�ʹ� ����");
			} else {
				System.out.println("��ǻ�ʹ� ��");
			}
			//��
			if (g == c) {
				System.out.println("�����ϴ�.");	
			}else if(g==1&&c==2) {
				System.out.println(lose);
			}else if(g==1&&c==3) {
				System.out.println(win);
				break;
			}else if(g==2&&c==1) {
				System.out.println(win);
				break;
			}else if(g==2&&c==3) {
				System.out.println(lose);
			}else if(g==3&&c==1) {
				System.out.println(lose);
			}else {
				System.out.println(win);
				break;
			}
			//count++;
			
			sc.close();
		}
		

	}

}
