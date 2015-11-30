package jp.ac.chibafjb.x15g003.kd161;

public class G161 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] test = new int[2];
		test[0] = 10;
		test[1] = 20;
		int work = 0;
		work = test[0];
		test[0] = test [1];
		test[1] = work;
		for(int i = 0;i<2;i++){
			System.out.format("test[%d] = %d\n" ,i,test[i]);
		}
		
		

	}

}
