package paiza;

import java.util.Scanner;

public class Paiza10_6 {
	public static void main(String[] args) {
	
	    // プレイヤー名を配列で記述する
	    String[] players = {"勇者", "戦士", "魔法使い", "忍者"};
	    try {
	    // 標準入力から整数を取り込み
	        Scanner sc = new Scanner(System.in);
	        int number = Integer.parseInt(sc.nextLine());
	    // 入力値に合わせて、プレイヤー名を表示する
	        System.out.println(players[number] + "はモンスターを倒した！");
	        sc.close();
	    } catch(ArrayIndexOutOfBoundsException e) {
	        System.out.println("0から" + (players.length - 1) + "の数値を入力してください");
	        e.printStackTrace();
	    } catch(NumberFormatException e) {
	        System.out.println("数値を入力してください");
	        e.printStackTrace();
	    } finally {
	    	System.out.println("次の冒険が始まった");
	    }
	}
}
