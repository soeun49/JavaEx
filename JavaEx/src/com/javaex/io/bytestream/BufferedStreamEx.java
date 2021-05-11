package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target= rootPath  + "img_buffered_copy.jpg";

	// 주 스트림의 성능이 낮음 -> 보조 스트림을 통해 성능을 향상 시킴 ↑
	public static void main(String[] args) {
	
		try {
			InputStream fis = new FileInputStream(source); //주 스트림
			OutputStream fos = new FileOutputStream(target); // 주 스트림 
			
			//보조 스트림: 주 스트림으로 부터 Stream을 얻어옴 
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//데이터 읽어오기
			byte [] data= new byte[10240]; // 10KB 버퍼 
			int size= 0; //읽어온 데이터 바이터 수 
			
			while((size = bis.read(data)) != -1) {
				bos.write (data) ; //출력
				System.out.println(size + "바이트 복사했습니다.");
			}
			
		bis.close();
		bos.close();
		//보조 스트링을 닫으면 주 스트림도 같이 닫힌다 -> 주 스트림을 따로 닫지 않아도 됨 
		
		System.out.println("파일을 복사했습니다.");
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
