package jp.ac.chibafjb.x15g003.kd231;

import java.util.Scanner;

class ArrayProc{
	public static int binarySearch1(int d[], int s){
		int L = 0;
		int H = 4;
		int m = (L+H)/2;
		for(int i = 0;L<=H & d[m]!=s;i++){
			if(d[m]<s){
				L = m+1;}
			else {
				H = m-1;}
			m = (L+H)/2;
		}
		if(L <= H){
			return m;
		}
		else return -1;
	}
}
public class G231 {
	public static void main(String[] args) {
		int data[] = {4,12,47,71,86};
		Scanner x = new Scanner(System.in);
		System.out.print("探索地の入力 →");
		int sint = x.nextInt();
		x.close();
		int xyz = ArrayProc.binarySearch1(data,sint);
		if(xyz==-1){
			System.out.format("探索値%dは、配列data[]に存在しません。" ,sint);
		}
		else System.out.format("探索値%dは、配列data[%d]に存在します。" ,sint,xyz);
	}
}

