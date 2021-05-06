package practice.opp.song;

public class SongApp {

	public static void main(String[] args) {
		Song s1= new Song () ;
			s1.setTitle ("좋은날");
			s1.setArtist ("아이유");
			s1.setAlbum("Real");
			s1.setComposer("이민수");
			s1.setYear(2010);
			s1.setTrack(3);
			
		Song s2=new Song();
			s2.setTitle("거짓말");
			s2.setArtist("BIGBANG");
			s2.setAlbum("Always");
			s2.setComposer("G-DRAGON");
			s2.setYear(2007);
			s2.setTrack(2);
			
		Song s3= new Song();
			s3.setTitle("벚꽃엔딩");
			s3.setArtist("버스커버스커");
			s3.setAlbum("버스커버스커1집");
			s3.setComposer("장범준");
			s3.setYear(2012);
			s3.setTrack(4);
		
	
	System.out.printf("%s, %s, (%s, %d, %d번 track, %s 작곡)%n", 
			s1.getArtist(), s1.getTitle(), s1.getAlbum(), 
			s1.getYear(), s1.getTrack(), s1.getComposer());
	
	System.out.printf("%s, %s, (%s, %d, %d번 track, %s 작곡)%n", 
			s2.getArtist(), s2.getTitle(), s2.getAlbum(), 
			s2.getYear(), s2.getTrack(), s2.getComposer());
	
	System.out.printf("%s, %s, (%s, %d, %d번 track, %s 작곡)%n", 
			s3.getArtist(), s3.getTitle(), s3.getAlbum(), 
			s3.getYear(), s3.getTrack(), s3.getComposer());
	
	s1.showInfo();
	s2.showInfo();
	s3.showInfo();
	
	
	}
}
