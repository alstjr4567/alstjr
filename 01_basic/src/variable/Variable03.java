package variable;

import java.util.Random;

public class Variable03 {
	public static void main(String[] args) {
		System.out.println("큰값 = " + Math.max(25, 36));
		System.out.println("큰값 = " + Math.max(78.9, 55.8));
		System.out.println();
		
		System.out.println(Math.random() );
		//System.out.println(random() ); Math클래스 안에 랜덤이있기에 이렇게쓰면 Variable03안에 있다고 인식해서 에러남
		 //65~90
		System.out.println((char)(Math.random()* 26 + 65) ); 
		
		System.out.println(new Random().nextDouble());
		//static 이 없으면 nwe새로만들어서 인포트 해야함. nextDouble가 스태틱이 없음
		
	}
}
/*
a~b 사이의 난수 발생 => (itn)(Math.random()*(b-a+1)+a)
static 이 없으면 nwe새로만들어서 인포트 해야함.

*/