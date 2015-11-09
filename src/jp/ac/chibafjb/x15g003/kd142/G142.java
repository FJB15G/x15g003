package jp.ac.chibafjb.x15g003.kd142;

import java.util.Scanner;

public class G142 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner x = new Scanner(System.in);
//		Scanner y = new Scanner(System.in);
		System.out.println("整数aの入力　--> ");
		System.out.println("整数bの入力　--> ");
		int a = x.nextInt();
		int b = x.nextInt();
		x.close();
		System.out.format("%d + %d = %d\n" ,a,b,a+b);
		System.out.format("%d - %d = %d\n" ,a,b,a-b);
		System.out.format("%d * %d = %d\n" ,a,b,a*b);
		System.out.format("%d / %d = %d\n" ,a,b,a/b);
	}
}