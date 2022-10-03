package paiza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paiza10_10 {
	// ファイルアクセス - try-with-resources
    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
        
        // try() の中にFileWriterオブジェクトの宣言
        // close() なしでも自動で閉じられる         
        try(FileWriter filewriter = new FileWriter(file)) {
            filewriter.write("Hello world\n");
            filewriter.write("Hello Java\n");
            // filewriter.close();
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        file = new File("articles.txt");
        try(Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            // scan.close();
        } catch (FileNotFoundException e) {
            System.err.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
