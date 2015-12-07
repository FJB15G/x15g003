package jp.ac.chibafjb.x15g003.kd171;

public class G171 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data[] ={100,200,300,0};
		int k = data.length-1;
		for(int i=0;i<k;i++){
			data[k-i] = data[k-i-1];
			}
		for(int y=0;y<k+1;y++){
			System.out.format("data[%d] = %d\n" ,y,data[y]);
		}
			

	}

}
