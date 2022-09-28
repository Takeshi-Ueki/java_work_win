// コマンドライン引数で例外を発生させる

package lesson5_1; 

public class Divide1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("計算開始");
		System.out.println("a / b = " + (a / b) + " 余り　" + (a % b));
		System.out.println("計算終了");
	}
}
