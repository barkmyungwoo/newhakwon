package io.silsub1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public MyNote() {

	}

	public void fileSave() {

		FileWriter fw = null;

		String name = "temp";

		try {
			System.out.println(name + "파일에 저장할 내용을 입력하세요.");
			System.out.println("종료는 exit");
			String temp = "";
			String str2 = "";
			sc.nextLine();
			do {
				temp = sc.nextLine();

				if (temp.equals("exit"))
					break;

				str2 += temp + "\n";

			} while (true);

			System.out.println("file name : ");
			name = sc.next();
			fw = new FileWriter(name);
			fw.write(str2);

			System.out.println("\n" + name + "에 저장됨.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen() {

		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름 입력해봐 : ");
		String fileName = sc.next();

		BufferedReader fi = null;

		char[] readData = new char[(int) new File(fileName).length()];

		try {

			fi = new BufferedReader(new FileReader(fileName));
			String str=null;
			System.out.println("읽은 값들 확인");
				
			while ((str=fi.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {
		System.out.println("파일 이름 : ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();

		BufferedReader fi = null;
		BufferedWriter bw = null;

		char[] readData = new char[(int) new File(fileName).length()];

		try {

			fi = new BufferedReader(new FileReader(fileName));
			fi.read(readData);

			System.out.println("읽은 값들 확인");
			System.out.println(new String(readData));

			bw = new BufferedWriter(new FileWriter(fileName, true));

			System.out.println(fileName + "파일에 저장할 내용을 입력하세요.");
			System.out.println("종료는 exit");

			do {
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;

				bw.write(str + "\n");

			} while (true);

			System.out.println("\n" + fileName + "에 저장됨.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 1. "수정할 파일명 : " 출력하고, 파일명 입력받음
		// 2. 파일 입력 스트림 생성
		// 3. 파일 출력 스트림 생성 : 단, 기존 내용 둔 상태로 생성할 것
		// 4. 파일의 내용을 읽어, StringBuilder 에 저장
		// 5. "파일에 추가할 내용을 입력하시오." 출력하고, 추가할 내용 입력받음
		// 6. 추가내용을 StringBuilder 에 추가함 : 반복
		// 7. "exit" 입력하면 반복 종료함
		// 8. "변경된 내용을 파일에 추가하시겠습니까? (y/n) : " 출력
		// 9. 대소문자 상관없이 'Y'이면, 파일에 기록함
		// 10. "ooo.txt 파일의 내용이 변경되었습니다." 출력
		// 11. 스트림 반납하고 리턴함

	}

}
