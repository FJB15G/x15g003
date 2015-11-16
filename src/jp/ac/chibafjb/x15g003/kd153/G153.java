package jp.ac.chibafjb.x15g003.kd153;

import java.util.Scanner;

public class G153 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner x = new Scanner(System.in);
		System.out.println("半径r --> ");
		float a = x.nextFloat();
		x.close();
		System.out.format("円周  = %.1f\n" ,2 * 3.14 * a);
		System.out.format("面積  = %.1f\n" , 3.14* a * a);
	}

}
