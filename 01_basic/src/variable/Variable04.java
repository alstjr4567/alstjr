package variable;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		int a = 10; //정수형 변수, 지역변수
		System.out.println("지역변수 a =" + a);
		System.out.println();
		
		Random r = new Random();//클래스형 변수 ,객체 라고부름 변수아님, r은 변수역할이지만 주소값을 가지고 있어서 객체라고 칭함
		//						  r은 Random클래스를 위치를 가르키는 역활
		System.out.println("객체 r =" + r);
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100)); //0~99 , 100은 안나옴
		System.out.println(r.nextInt(26)+ 65); //65~90
		System.out.println();
		
		String b = new String("사과");
		String c = "딸기"; //문자열 literal 생성
		//문자열은 주소를 가지고 있기에 상수가 아니다.
		System.out.println(b + "\t" + c);
		
	}//main
}
/*
new연산자가 앞에 붙으면 Random이라는 클래스가 하나 만들어진다, r은 클래스의 주소를 가지고있다.
r은 Random클래스를 가르키는 역활

new 연산자는 일회용 new 한번쓰고 버린다
r이 주소를 가지고있기에 r을 사용하면 됨.

*/