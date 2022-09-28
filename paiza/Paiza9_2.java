// 例外処理 - いろいろな例外対応

package paiza;

public class Paiza9_2 {

	public static void main(String[] args) {
		System.out.println("Hello World");

		try {
			int number = 0;
			int answer = 100 / number;
			System.out.println(answer);
		} catch (Exception e) {
			// コンソールに表示
			System.out.println("0では割り算できません。");
			System.out.println(e);

			// エラーメッセージ
			System.err.println("0では割り算できません。");
			e.printStackTrace();
		} finally {
			System.out.println("Hello Java");
		}
	}
}
