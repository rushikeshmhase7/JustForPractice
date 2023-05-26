package demo2;

public class Demo2 {

	public static void main(String[] args) {
		
		Wishes anniversary=new Wishes() {

			@Override
			public void wish() {
              System.out.println("Happy Anniversary");				
			}
			
		};
		anniversary.wish();
		System.out.println(anniversary);
		
		Wishes birthday=new Wishes() {

			@Override
			public void wish() {
             System.out.println("Happy Birthday");	
			}
			
		};
		birthday.wish();
		System.out.println(birthday);
	
		
	}
}
