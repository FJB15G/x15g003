package jp.ac.chibafjb.x15g003.kd222;

import java.util.Scanner;

class ArrayProc{
	public static double linerSearch1(double s[],double n){
		int i = 0;
		for (;i<100 && s[i]!=n;i++)
			i=i+1;
		return i;
	}
}


public class G222 {
	public static void main(String[] args) {
		double[] score = new double[101];
		for(int i=0;i<100;i++)
			score[i] = (double) (Math.random()*100);
		score[10]  = 1.5;
		score[100] = 99;
		Scanner x = new Scanner(System.in);
		System.out.print("探索値の入力 ");
		double num = x.nextDouble();
		x.close();
		System.out.println("\nlinerSearch1の結果");
		double xyz = ArrayProc.linerSearch1(score,num);
		if(xyz<100)
			System.out.format("探索値%dは、配列score[%d]に存在します。\n" ,num,xyz);
		else System.out.println("探索値は配列scoreに存在しません。\n");	
		
	}

}