package jp.ac.chibafjb.x15g003.kd151;

import java.util.Scanner;

public class G151 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner x = new Scanner(System.in);
		System.out.println("aの入力　--> ");
		float a = x.nextFloat();
		System.out.println("bの入力　--> ");
		float b = x.nextFloat();
		
		x.close();
		System.out.format("%.2f + %.2f = %f\n" ,a,b,a+b);
		System.out.format("%.2f - %.2f = %f\n" ,a,b,a-b);
		System.out.format("%.2f * %.2f = %f\n" ,a,b,a*b);
		System.out.format("%.2f / %.2f = %f\n" ,a,b,a/b);
		
		

	}

}
