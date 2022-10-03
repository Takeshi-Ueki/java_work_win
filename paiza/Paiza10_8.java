package paiza;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paiza10_8 {
	// ファイルアクセス
	
    public static void main(String[] args) throws IOException {

        File file = new File("articles.txt");
        
        // ファイル書き込み
        FileWriter filewriter = new FileWriter(file);
        filewriter.write("Hello world\nHello Java\n");
        filewriter.close();
        // ファイル読み込み
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}
