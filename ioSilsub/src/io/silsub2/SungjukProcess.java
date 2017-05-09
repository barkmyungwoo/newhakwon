package io.silsub2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {
	Scanner sc = new Scanner(System.in);

	public void sungjukSave() {
		int kor,eng,math, sum=0;
		double avg;
		FileWriter fw = null;		
		String name = "score.dat";

		
		do {
			String str = null;
			System.out.println("���� �Է�");
			System.out.print("���� : ");
			kor = sc.nextInt();
			System.out.print("���� : ");
			eng = sc.nextInt();
			System.out.print("���� : ");
			math = sc.nextInt();
			sum = kor + eng + math;
			avg = (double)(sum / 3);
			str = kor + " " + eng + " " + math + " " + sum + " " + avg + "\n";
			try {
				fw = new FileWriter(name,true);
				fw.write(str);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fw.close();
					System.out.println();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			System.out.println("��� �Ͻðڽ��ϱ�? Y/N");
			
		} while (sc.next().toUpperCase().charAt(0)=='Y');
		
		System.out.println("score.dat�� ����Ϸ�.");
		
		// 1. ���������α���, ����, ���� ������ �Է¹޾�,
		// 2. ����(int), ���(double)�� ����ϰ�
		// 3. "score.dat" ���Ͽ� ��, ��, ��, ����, ����� ��� ������
		// 4. "��� �����Ͻðڽ��ϱ�? (y/n) : " ���� 'Y'�̸� �ݺ� ������
		// 5. 'N' �̸� �ݺ� �����ϰ�, "score.dat �� ���� �Ϸ�." �����
	}

	public void scoreRead() {
		
		BufferedReader fi = null;
		int kor, eng, math, sum, tsum=0, cnt=0;
		double avg, tavg = 0;
		try {

			fi = new BufferedReader(new FileReader("score.dat"));
			String str=null;
			String[] data = new String[5];
			
			System.out.println("�л�\t����\t����\t����\t����\t���");
				
			while ((str=fi.readLine()) != null) {
				data = str.split(" ");
				kor = Integer.parseInt(data[0]);
				eng = Integer.parseInt(data[1]);
				math = Integer.parseInt(data[2]);
				sum = Integer.parseInt(data[3]);
				avg = Double.parseDouble(data[4]);
				
				tsum += Integer.parseInt(data[3]);
				tavg += Double.parseDouble(data[4]);
				
				cnt++;
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f",cnt,kor,eng,math,sum,avg);
				System.out.println();
			}
			
			System.out.println("----------------------------------------------------");
			System.out.printf("��ü ���� : " + tsum +", ��ü ��� : %.2f",(tavg/cnt));

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fi.close();
				System.out.println();
				System.out.println("score.dat ���� �б� �Ϸ�.");
				System.out.println();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		// 1. ���Ͽ� ��ϵ� ������ ��, ��, ��, ����, ��� ������ �о�ͼ�
		// 2. ������ �����ϰ� ����ϰ�, ������ ��, ����� ���� ���ϰ�
		// ��, ����� �Ҽ��� ��°�ڸ������� ��µǰ� ��
		// 3. ��ü ������ ��ü ����� �о�� Ƚ���� ������
		// ���� Ƚ���� ��ü����, ��ü ��� ȭ�� �����
		// ��, ��ü ����� �Ҽ��� ��°�ڸ������� ��µǰ� ��
		// 4. �бⰡ ������ "score.dat ���� �б� �Ϸ�." ���
	}

	public static void main(String[] args) {

		do {
			System.out.print("���� (1.Save/2.Read) : ");
			int num = new Scanner(System.in).nextInt();
			if (num == 1)
				new SungjukProcess().sungjukSave();
			if (num == 2)
				new SungjukProcess().scoreRead();
			if (num == 9)
				break;
		} while (true);

		// 1. ������ ���� ��ü ����
		// 2. �޼ҵ� ����
	}

}
