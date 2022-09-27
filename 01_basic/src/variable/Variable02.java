package variable;

public class Variable02 {
	static int a; //필드(전역에 잡힘) 초기화 되어있다. 초기화안해도됨
	int b;
	
	public static void main(String[] args) {
		int a = 5; //local variable(지역변수) 속해있는 {}중괄호 안에 잡힘, 반드시초기화 해야한다.
		int b;
		
		System.out.println( "지역변수 a = " + a );
		System.out.println( "필드 a = " + Variable02.a );
		System.out.println( "필드 a = " + new Variable02().b );
		
	}
}
/*
local variable(지역변수) : 일정구역에 있는 변수 {}중괄호 안에 있는 변수
스테틱을 붙이면 다른 클래스에서 쓸수있지만 (클래스명.변수)
다른클래스 에있는 변수를 쓰려면 스태틱을 쓰던가 생성해줘야함 nwe 클래스명().변수
*/