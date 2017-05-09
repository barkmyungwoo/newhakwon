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
			System.out.println("점수 입력");
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
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
			System.out.println("계속 하시겠습니까? Y/N");
			
		} while (sc.next().toUpperCase().charAt(0)=='Y');
		
		System.out.println("score.dat에 저장완료.");
		
		// 1. 정수형으로국어, 영어, 수학 점수를 입력받아,
		// 2. 총점(int), 평균(double)을 계산하고
		// 3. "score.dat" 파일에 국, 영, 수, 총점, 평균을 기록 저장함
		// 4. "계속 저장하시겠습니까? (y/n) : " 에서 'Y'이면 반복 실행함
		// 5. 'N' 이면 반복 종료하고, "score.dat 에 저장 완료." 출력함
	}

	public void scoreRead() {
		
		BufferedReader fi = null;
		int kor, eng, math, sum, tsum=0, cnt=0;
		double avg, tavg = 0;
		try {

			fi = new BufferedReader(new FileReader("score.dat"));
			String str=null;
			String[] data = new String[5];
			
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균");
				
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
			System.out.printf("전체 총점 : " + tsum +", 전체 평균 : %.2f",(tavg/cnt));

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
				System.out.println("score.dat 파일 읽기 완료.");
				System.out.println();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		// 1. 파일에 기록된 정보를 국, 영, 수, 총점, 평균 순으로 읽어와서
		// 2. 변수에 저장하고 출력하고, 총점의 합, 평균의 합을 구하고
		// 단, 평균은 소숫점 둘째자리까지만 출력되게 함
		// 3. 전체 총점과 전체 평균을 읽어온 횟수로 나누어
		// 읽은 횟수와 전체총점, 전체 평균 화면 출력함
		// 단, 전체 평균은 소숫점 둘째자리까지만 출력되게 함
		// 4. 읽기가 끝나면 "score.dat 파일 읽기 완료." 출력
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

		// 1. 실행을 위한 객체 생성
		// 2. 메소드 실행
	}

}
