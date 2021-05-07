package com.javaex.exception;

import javax.imageio.IIOException;

public class ThrowExcept {

	//예외의 두 종류
	//종류1. checked Exception- 반드시 예외처리를 해주어야 함 
	//종류 2. unchecked Exception - 예외 처리를 해주지 않아도 됨
	
	//checked Exception
	public void executeException() throws IIOException {
		
		System.err.println("강제 예외 발생");
		throw new IIOException("강제 예외");
	}
	
	//unchecked Exception
public void executeRuntimeException() {
	System.err.println("강제 런타임 예외");
	throw new RuntimeException("런타임 예외");
}

public double divide (int num1, int num2) {
	double result;
	
	//일반적인 예외 -> 가급적이면 구체적인 "예외로 전환"해서 
	//예외 상황에서의 상황 정보를 담고 있는 것이 좋다 (!)
	try {
		result = num1/num2;
	}catch (ArithmeticException e) {
		//구체적인 예외로 전환  => 바깥으로 throw
		System.err.print("예외의 전환");
		throw new CustomArithmeticException("사용자 정의 예외", num1, num2);
	}
 	
	return result;
}
}
