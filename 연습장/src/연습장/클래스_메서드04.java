package 연습장;
class Book{
	String title;
	String author;
	int price;
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
public class 클래스_메서드04 {

	public static void main(String[] args) {
		
		Book bk1=new Book();
		bk1.title="자바";
		bk1.author="자바";
		bk1.price=3000;
		
		Book bk2 = new Book();
		
		
	}
}
