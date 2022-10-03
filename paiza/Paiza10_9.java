package paiza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paiza10_9 {
	// ファイルアクセス - 例外処理

    public static void main(String[] args) {

        File file = new File("articles.txt");
        
        try {
            // ファイル書き込み
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("Hello world\n");
            filewriter.write("Hello Java\n");
            filewriter.close();
        } catch(IOException e) {
                System.out.println("ファイル書き込みに失敗しました");
                e.printStackTrace();
        }

        // エラーを発生させている        
        file = new File("abc.txt");
        
        // ファイル読み込み
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
