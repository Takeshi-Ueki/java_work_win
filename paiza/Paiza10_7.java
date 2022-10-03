package paiza;

//例外処理 - throw

public class Paiza10_7 {
	public static void main(String[] args) {
		System.out.println("Hello World");

		try {
			int number = 2;
			int answer = 100 / number;
			System.out.println(answer);
			throw new Exception("強制エラー");
		} catch (ArithmeticException e) {
			System.out.println("0では、割り算できません。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("Hello Java");
		}
	}
}
