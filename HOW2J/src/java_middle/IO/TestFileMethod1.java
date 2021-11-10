package java_middle.IO;

import java.io.File;

public class TestFileMethod1 {
	public static void main(String[] args) {
		File f = new File("D:\\LOLFolder\\LOL.exe");
		System.out.println("current file is: " + f);
		System.out.println("validate exist: " + f.exists());
		System.out.println("validate directory: " + f.isDirectory());
	}
}
