package jp.ac.chibafjb.x15g003.kd211;

class  ArrayProc1{
	public static int maxFind1(int num[],int a){
		int m = 0;
		int i = 0;
			for(;a>i;i++){ 
				if(num[i]>m)
				m = num[i];
			}
		return m;
	}
}

class  ArrayProc2{
	public static int maxFind2(int num[],int a){
		int i = 1;
		int m = 5;
			for(;a>i;i++){
				if(num[i]>m)
					m = num[i];
			}
		return m;
		
	}
}

public class G211 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num[] = {10,500,30,50,40};
		int a =num.length;
		int xyz = ArrayProc1.maxFind1(num,a);
		System.out.format("maxFind1 結果\n配列numの最大値は、%dです。\n" ,xyz);
		int abc = ArrayProc2.maxFind2(num,a);
		System.out.format("maxFind2 結果\n配列numの最大値は、%dです。" ,abc);
		
	}

}

//インスタンスの作成
//クラス型 変数名 = new クラス名()
