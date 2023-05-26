package demo3;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Wishes anniversary=()->System.out.println("Happy Anniversary");
		anniversary.wish();
		
		Wishes birthday=()->System.out.println("Happy Birthday");
		birthday.wish();
		
	}

}
