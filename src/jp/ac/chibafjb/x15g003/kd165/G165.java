package jp.ac.chibafjb.x15g003.kd165;

public class G165 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = {5,10,15};
		int m = a.length;
		int[] b = new int[3];
		for(int i=0;i<m;i++){
			b[i] = a[(a.length-1)-i];
			System.out.format("b[%d] = %d\n" ,i,b[i]);
		}
	

	}
}
