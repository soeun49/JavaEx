package com.javaex.io.bytestream;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//입력 소스
		byte []insrc = {0,1,2,3,4,5,6,7,8,9};
		
		//출력 target
		byte[] target = null;
		
		System.out.println("입력 소스: " + Arrays.toString(insrc));
		
		try { 
			InputStream bis = new ByteArrayInputStream(insrc);
			OutputStream bos = new ByteArrayOutputStream();
			
			int data= 0; //데이터 저장 변수
			
			while ((data=bis.read()) != -1) {
				System.out.println("Read Data: " + data);
				bos.write(data);
				
			
		}

			target = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("target: " + Arrays.toString(target));
			
			bos.close();
			bis.close();
	} 	catch (IOException e) {
		//입출력 예외는 여기서 처리
		e.printStackTrace();
		
	} catch (Exception e) {
		//위에서 처리되지 않은 예외를 처리
	}

}

}