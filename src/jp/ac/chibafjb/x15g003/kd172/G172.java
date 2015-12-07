package jp.ac.chibafjb.x15g003.kd172;

public class G172 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x[] = {1,2,3};
		int y[] = {7,8};
		int m = x.length;
		int n = y.length;
		int z[] = new int[m+n];
		for(int i=0;i<m;i++){
			z[i] = x[i];
		}
		for(int q=0;q<n;q++){
			z[m+q] = y[q];
		}
			System.out.format("z[] = {%d,%d,%d,%d,%d}\n" ,z[0],z[1],z[2],z[3],z[4]);

	}

}
