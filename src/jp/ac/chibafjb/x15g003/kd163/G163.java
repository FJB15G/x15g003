package jp.ac.chibafjb.x15g003.kd163;

public class G163 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		int[] x = {33,18,102,47,5};
		int n = x.length;
		for (int i=0;i<n;i++){
			sum = x[i]+sum;
		}
		System.out.format("合計 = %d\n" ,sum);

	}

}
