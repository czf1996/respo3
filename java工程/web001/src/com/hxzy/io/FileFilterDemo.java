package com.hxzy.io;

import java.io.File;

public class FileFilterDemo {
	public static void main(String[] args) {
		File file=new File("D:\\java\\workspace\\eclipse\\web01\\src");
		printLn( file,"--->");
	}
	private static void printLn(File file,String str){
		str+="--->";
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {
			if(f.isDirectory()){
				System.out.println(str+f.getName());
				printLn(f, str);
			}else{
				System.out.println(str+f.getName());
			}
		}
	}
}
