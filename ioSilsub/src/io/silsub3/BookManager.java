package io.silsub3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public void fileSave() {
		Book[] book = new Book[5];

		book[0] = new Book("박명우 회고록", "박명우", 1985, 8, 23, 20000, 0.2);
		book[1] = new Book("박제언 자서전", "박제언", 1988, 11, 3, 25000, 0.1);
		book[2] = new Book("이재훈 집필전", "이재훈", 1980, 5, 13, 30000, 0.3);
		book[3] = new Book("나상민 위인전", "나상민", 1995, 6, 22, 10000, 0.5);
		book[4] = new Book("유재영 유머집", "유재영", 2005, 2, 1, 2000, 0.8);

//		for (int i = 0; i < book.length; i++) {
//			book[i] = new Book();
//
//		}

		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("book.dat"));) {
			for (int i = 0; i < book.length; i++) {
				oo.writeObject(book[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("book.dat"));) {
			while (true) {
				System.out.println(oi.readObject().toString());
			}
		} catch (EOFException e) {
			System.out.println("hi");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
