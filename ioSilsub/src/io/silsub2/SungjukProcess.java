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
				System.out.println("점수 입력");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				sum = kor + eng + math;
				avg = (double) sum / 3;

				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(math);
				dout.writeInt(sum);
				dout.writeDouble(avg);

				System.out.println("계속 하시겠습니까? Y/N");

			} while (sc.next().toUpperCase().charAt(0) == 'Y');

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("score.dat에 저장완료.");
	}

	public void scoreRead() {
		int kor, eng, math, sum, tsum = 0, cnt = 1;
		double avg, tavg = 0;

		try (DataInputStream din = new DataInputStream(new FileInputStream("score.dat"))) {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균");

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
			System.out.printf("전체 총점 : " + tsum + ", 전체 평균 : %.2f", (tavg / cnt));
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		do {
			System.out.print("선택 (1.Save/2.Read) : ");
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
