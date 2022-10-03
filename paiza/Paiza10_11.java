package paiza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paiza10_11 {
	// 例外処理 - throws

    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
        try (FileWriter filewriter = new FileWriter(file)) {
            filewriter.write("Hello world\n");
            filewriter.write("Hello Java\n");
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        file = new File("articles.txt");
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
    
    // メソッドで例外が起きた場合呼び出しもとへエラーを投げる    
    public static Scanner makeScanner(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        return scan;
    }
}
