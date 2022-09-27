package Operator;

public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a = "+ a);
		System.out.println("!a = "+!a);
		System.out.println();
		
		String b = "apple";
		String c = new String("apple");
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); //다르다
		//다른이유 참조값 비교 주소값을 물어보는것 실제데이터 아님 apple의 주소를 알려줌
		
		System.out.println("b != c :" + (b != c ? "참" : "거짓"));
		System.out.println("b.eauals(c) : " + (b.equals(c)? "같다" : "다르다"));
		System.out.println("!b.equals(c) : " + (!b.equals(c)? "참" : "거짓"));
	
	}
}
