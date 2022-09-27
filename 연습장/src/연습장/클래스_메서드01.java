package 연습장;

public class 클래스_메서드01 {

	public static void main(String[] args) {
		
		show();//show메서드 호출
		System.out.println("가나다");
		show();//show메서드 호출
		System.out.println("라마바");
		show();
		System.out.println("----------");
		
		add(3,4);//순서대로 넘어감 호출
		add(100,200); //호출
		System.out.println("----------");
		
		//sub(100,11,22); //호출 , 값 보내는 것(보내기만 가능 리턴값 못받음)
		int a = sub(100,11,22); //값을 받는것 리턴갑을받아 a변수에 담는다.
		System.out.println("a 값 : "+a);
		
		int mul = multiply(5,20);
		System.err.println("mul : "+mul);
		
	}//main
	static void show() {//메서드 정의
		System.out.println("show메스드 정의 부분");
		System.out.println("즐거운 자바 공부");
	}
	static void add(int x,int y) {//호출하면 순서대로 넘어감
		System.out.println("두 수의 합"+(x+y)); //값을 메서드 안에서 출력함 호출만하면 출력됨.
		return; // 호출한 곳으로 돌아가라
	}
	static int sub(int x,int y,int z) {
		int result = x-y-z;
		return result; //리턴값은 67이다. //값을 메서드안에서 출력안함 호출할때 변수로 담아야함.
	}
	static int multiply(int a,int b) {
		int c = a*b;
		return c;
		
	}

}
/*
 위치에 상관없이 메인메서드부터 먼저 시작이된다.
 매개변수 : 호출할때 넘어오는 값을 받아주는 변수
 위 메서드명()<-- 괄호안에 있는 변수가 매개변수다
 
*/