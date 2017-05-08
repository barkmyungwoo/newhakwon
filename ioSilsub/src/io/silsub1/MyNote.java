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
			System.out.println(name + "���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("����� exit");
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

			System.out.println("\n" + name + "�� �����.");

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
		System.out.println("���� �̸� �Է��غ� : ");
		String fileName = sc.next();

		BufferedReader fi = null;

		char[] readData = new char[(int) new File(fileName).length()];

		try {

			fi = new BufferedReader(new FileReader(fileName));
			String str=null;
			System.out.println("���� ���� Ȯ��");
				
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
		System.out.println("���� �̸� : ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();

		BufferedReader fi = null;
		BufferedWriter bw = null;

		char[] readData = new char[(int) new File(fileName).length()];

		try {

			fi = new BufferedReader(new FileReader(fileName));
			fi.read(readData);

			System.out.println("���� ���� Ȯ��");
			System.out.println(new String(readData));

			bw = new BufferedWriter(new FileWriter(fileName, true));

			System.out.println(fileName + "���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("����� exit");

			do {
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;

				bw.write(str + "\n");

			} while (true);

			System.out.println("\n" + fileName + "�� �����.");

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

		// 1. "������ ���ϸ� : " ����ϰ�, ���ϸ� �Է¹���
		// 2. ���� �Է� ��Ʈ�� ����
		// 3. ���� ��� ��Ʈ�� ���� : ��, ���� ���� �� ���·� ������ ��
		// 4. ������ ������ �о�, StringBuilder �� ����
		// 5. "���Ͽ� �߰��� ������ �Է��Ͻÿ�." ����ϰ�, �߰��� ���� �Է¹���
		// 6. �߰������� StringBuilder �� �߰��� : �ݺ�
		// 7. "exit" �Է��ϸ� �ݺ� ������
		// 8. "����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n) : " ���
		// 9. ��ҹ��� ������� 'Y'�̸�, ���Ͽ� �����
		// 10. "ooo.txt ������ ������ ����Ǿ����ϴ�." ���
		// 11. ��Ʈ�� �ݳ��ϰ� ������

	}

}
