package com.hxzy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		//�ļ�������ԭ
		String src="C:\\Users\\Administrator\\Desktop\\������Ӧ.png";
		//�ļ������������֣�dest
		String dest="C:\\Users\\Administrator\\Desktop\\������Ӧ02.png";
		//����һ���ļ���������ȥ���ļ��ж�ȡ����
		FileInputStream fis =new FileInputStream(src);
		int count=0;
		//����һ���ļ������������ȡ��������д����dest
		FileOutputStream fos = new FileOutputStream (dest);
		//�ڶ�ȡ�ļ���ʱ�򣬶����ļ�ĩβ�ı�ʶ��-1
		while((count=fis.read())!=-1){
			fos.write(count);
		}
	}

}
