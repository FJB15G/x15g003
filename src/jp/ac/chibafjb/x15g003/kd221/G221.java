package jp.ac.chibafjb.x15g003.kd221;

import java.util.Scanner;

class ArrayProc{
	public static int linerSearch1(int s[],int n){
		int i = 0;
		for (;i<100 && s[i]!=n;i++)
			i=i+1;
		return i;
	}
	public static int linerSerch2(int s[],int n){
		int i =99;
		for (;i>=0 && s[i]!=n;i--)
			i = i-1;
		if(i == -1){
			return i=100;
		}
		else return i;
		
	}
}


public class G221 {
	public static void main(String[] args) {
		int[] score = new int[101];
		for(int i=0;i<100;i++)
			score[i] = (int) (Math.random()*100);
		score[100] = 999;
		Scanner x = new Scanner(System.in);
		System.out.print("探索値の入力 ");
		int num = x.nextInt();
		x.close();
		System.out.println("\nlinerSearch1の結果");
		int xyz = ArrayProc.linerSearch1(score,num);
		if(xyz<100)
			System.out.format("探索値%dは、配列score[%d]に存在します。\n" ,num,xyz);
		else System.out.println("探索値は配列scoreに存在しません。\n");	
		
		System.out.println("\nlinerSearch2の結果");
		int vwx = ArrayProc.linerSerch2(score,num);
		if(vwx<100)
			System.out.format("探索値%dは、配列score[%d]に存在します。 \n" ,num,vwx);
		else System.out.println("探索地は配列scoreに存在しません。 \n");
	}

}
