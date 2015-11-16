package jp.ac.chibafjb.x15g003.kd144;

import java.util.Scanner;

public class G144 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner x = new Scanner(System.in);
		System.out.println("住所の入力　-->");
		System.out.println("氏名の入力　-->");
		System.out.println("電話番号の入力　-->");
		String a = x.next();
		String b = x.next();
		String c = x.next();
		x.close();
		System.out.format("＜確認＞住　　所 : %s\n　　　　氏　　名 : %s\n　　　　電話番号 : %s\n" ,a,b,c);
	}

}
