package demo1;

public class Demo1 {
public static void main(String[] args) {
	System.out.println("Welcome to wish page");
	System.out.println("++++++++++++++++++++");
	AnniversaryWishes a=new AnniversaryWishes();
	a.wish();
	BirthdayWishes b=new BirthdayWishes();
	b.wish();
}
}
