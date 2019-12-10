package com.hxzy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		//文件拷贝的原
		String src="C:\\Users\\Administrator\\Desktop\\请求响应.png";
		//文件拷贝的新名字：dest
		String dest="C:\\Users\\Administrator\\Desktop\\请求响应02.png";
		//创建一个文件输入流，去从文件中读取数据
		FileInputStream fis =new FileInputStream(src);
		int count=0;
		//创建一个文件输出流，将读取的输入流写出到dest
		FileOutputStream fos = new FileOutputStream (dest);
		//在读取文件的时候，读到文件末尾的标识是-1
		while((count=fis.read())!=-1){
			fos.write(count);
		}
	}

}
