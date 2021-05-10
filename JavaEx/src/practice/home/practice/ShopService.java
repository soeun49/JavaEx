package practice.home.practice;
//#6장 연습문제 - #18

public class ShopService {
	
	private static ShopService singleton= new ShopService();
	
	private ShopService() {
		
	}
	public static ShopService getInstance() {
		return singleton;
	}
}
