package jp.ac.chibafjb.x15g003.kd173;

import java.util.Scanner;

public class G173 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data[] = new int [4];
		int k = data.length-1;
		Scanner z = new Scanner(System.in);
		for(int i =0;i<k;i++){
			System.out.format("配列[%d]の入力  " ,i);
			int a = z.nextInt();
			data[i] = a;
		}
		z.close();
		for(int i=0;i<k;i++){
			data[k-i] = data[k-i-1];
			}
		System.out.println("結果");
		for(int y=0;y<k+1;y++){
			System.out.format("data[%d] = %d\n" ,y,data[y]);
		}
			

	}

}
