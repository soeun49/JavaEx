package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject;
	private String roomname;
	
	public ClassRoom (String subject) {
		this.subject=subject;
	}
	public ClassRoom (String subject, String roomname) {
		this(subject);
		this.roomname=roomname;
	}
	
	//cotainsValue
	//객체의 동등성 비교
	
	@Override
	public int hashCode() {
		
		return subject.hashCode(); //subject룰 식별자로 
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject) && roomname.equals(other.roomname);
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomname=" + roomname + "]";
	}
	
	
}
