package basic;

public class HelloTest {
	public static void main(String[] args) {
		System.out.print("안녕하세요.\n");
		System.out.println("반갑습니다.");
		System.out.println("사과\t딸기\t바나나");
		System.out.println("abcdefg\t딸기\t바나나");
		System.out.println(25+36); // 61
		System.out.println("25+36"); // 25+36
		System.out.println("25"+"36"); // 2536
		System.out.println("25+36" + (25+36)); //()로 묶어야 최우선연산자로 먼저계산함
		
	}
}
/*
제어문자
\n : new line (다음줄)
\t : tab(tab탭과 같은기능)
tab은 칸을 띄우는게아니라 정해진 위치에 가는것임
문자(''):한글자만 해당함
문자열(""):모든 글자
자바만 해당함.
문자열은 계산능력이 없다 +하면 결합된다.



*/