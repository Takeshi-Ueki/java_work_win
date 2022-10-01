package lesson5_3;

import java.io.IOException;

public class WriteFile {
	public void open() {
		System.out.println("ファイルを開きます");
	}
	public void write() throws IOException {
		throw new IOException();
	}
	public void close() {
		System.out.println("ファイルを保存して閉じます");
	}
}
