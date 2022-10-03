package paiza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paiza10_12 {
	// 0から99まで表示する

    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
        try (FileWriter filewriter = new FileWriter(file)) {
            for (int i = 0; i < 100; i++){
                filewriter.write(i + "\n");
            }
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        try (Scanner scan = makeScanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }

    // 再スローする際はメソッドにthrowsの記述と例外処理が必要   
    public static Scanner makeScanner(File file) throws FileNotFoundException {
        try {
            Scanner scan = new Scanner(file);
            return scan;
        } catch (FileNotFoundException e) {
            System.err.println("makeScannerで例外を検出しました");
            throw e;
        }
    }

}
