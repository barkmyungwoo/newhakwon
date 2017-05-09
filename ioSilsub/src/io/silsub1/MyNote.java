package io.silsub1;

import java.io.*;
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

		System.out.println("���� �̸� �Է��غ� : ");
		String fileName = sc.next();

		BufferedReader fi = null;

		try {
			fi = new BufferedReader(new FileReader(fileName));
			String str=null;
			System.out.println("���� ���� Ȯ��");
				
			while ((str=fi.readLine()) != null) {
				System.out.println(str);
			}
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
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {
		System.out.println("���� �̸� : ");
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
				bw.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
