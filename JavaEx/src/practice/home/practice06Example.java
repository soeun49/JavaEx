package practice.home;

//#6장 연습문제

public class practice06Example {

	public static void main(String[] args) {
	//	Ex15();
	//	Ex16();
	//	Ex17();
	//	Ex18();
	Ex19();
		
	}
	
	private static void Ex19() {
		Account account = new Account ();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
	}
	
	private static void Ex18() {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
						
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
	private static void Ex17() {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");

	}	
	private static void Ex16() {
		Printer printer = new Printer ();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}
	private static void Ex15() {
		MemberService memberService = new MemberService();
		boolean result = memberService.login ("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else  {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

	}


