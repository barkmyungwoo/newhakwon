package io.silsub2;

import java.io.*;
import java.util.Scanner;

public class SungjukProcess {
	Scanner sc = new Scanner(System.in);

	public void sungjukSave() {

		int kor, eng, math, sum = 0;
		double avg;
		String name = "score.dat";

		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream(name, true))) {

			do {
				System.out.println("���� �Է�");
				System.out.print("���� : ");
				kor = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				sum = kor + eng + math;
				avg = (double) sum / 3;

				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(math);
				dout.writeInt(sum);
				dout.writeDouble(avg);

				System.out.println("��� �Ͻðڽ��ϱ�? Y/N");

			} while (sc.next().toUpperCase().charAt(0) == 'Y');

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("score.dat�� ����Ϸ�.");
	}

	public void scoreRead() {
		int kor, eng, math, sum, tsum = 0, cnt = 1;
		double avg, tavg = 0;

		try (DataInputStream din = new DataInputStream(new FileInputStream("score.dat"))) {
			System.out.println("�л�\t����\t����\t����\t����\t���");

			do {
				kor = din.readInt();
				eng = din.readInt();
				math = din.readInt();
				sum = din.readInt();
				avg = din.readDouble();

				tsum += sum;
				tavg += avg;

				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f", cnt, kor, eng, math, sum, avg);
				System.out.println();
				cnt++;
			} while (true);

		} catch (EOFException e) {
			System.out.println("----------------------------------------------------");
			System.out.printf("��ü ���� : " + tsum + ", ��ü ��� : %.2f", (tavg / cnt));
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	}
}
