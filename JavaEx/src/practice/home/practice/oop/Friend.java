package practice.home.practice.oop;

public class Friend {

	private String name;
	private String number;
	private String school;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;}
	
	
	 public void showInfo(){
	        System.out.println("이름:"+name+"  핸드폰:"+number+"  학교:"+school);
}
	}
