package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx2 {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename= rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//writePrimitives();
		readPrimivies();
	}
		private static void readPrimivies( ) {
			
			//저장된 데이터를 불러와서 기본 타입으로 복원
			try {
				InputStream fis = new FileInputStream(filename);
				DataInputStream dis = new DataInputStream(fis);
				
				for (int i=0; i<2; i++) {
					//주의! 출력 한 순서에 맞게 불러와야 함 
					String s= dis.readUTF(); //문자열
					boolean b= dis.readBoolean(); //논리열
					int val = dis.readInt(); //정수열
					float f = dis.readFloat(); // 실수열 
					
//					double d = dis.readDouble(); -> Error
					System.out.printf("%s:%b:%d:%f%n", s,b,val,f);
					
					
				}
				dis.close();
				
			}catch (FileNotFoundException e) {
				System.err.println("파일을 찾지 못했습니다.");
				
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private static void writePrimitives( ) {
		try {
			// 주 스트림 
			OutputStream fos = new FileOutputStream (filename);
			
			// 보조 스트림 
			DataOutputStream dos = new DataOutputStream (fos);
			
			// 각 기본타입 저장을 위한 write 메서드가 마련되어 있다. 
			dos.writeUTF("홍길동"); //문자열 
			dos.writeBoolean (false); //논리형 
			dos.writeInt(25); //정수형
			dos.writeFloat(80.9f); //실수형
			
			dos.writeUTF("고길동");  
			dos.writeBoolean (true);
			dos.writeInt(45);
			dos.writeFloat(99.9f);
			
			dos.close();
			System.out.println("기본 데이터 타입 저장!");
			
			// 출력 순서= 입력 순서 : 문자열= 논리형= 정수형= 실수형 순으로 출력 됨 
			
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch (IOException e) { 
			e.printStackTrace();
		}
	}


	}

