package jp.ac.chibafjb.x15g003.kdT21;

import java.util.Scanner;

public class GT21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・
		Scanner x = new Scanner(System.in);
		System.out.print("ハンバーガーの個数　--> ");
		int a = x.nextInt();
		System.out.print("フライドポテトの個数　--> ");
		int b = x.nextInt();
		int c =100*a;
		System.out.format("ハンバーガーの代金　　=　%d円 \n" ,c);
		int d =180*b;
		System.out.format("フライドポテトの代金　=　%d円 \n" ,d);
		System.out.format("小計				  =　%d円 \n" ,c+d);
		int e = (int)((double)(c+d)*0.08);
		System.out.format("消費税                =　%d円 \n" ,e);
		System.out.format("合計金額              =　%d円 \n" ,c+d+e);
		int f = c+d+e; 
		System.out.print("受取金額              =　--> ");
		int g = x.nextInt();
		x.close();
		System.out.format("つり銭                =　%d円 \n" ,g-f);
		
	}

}
