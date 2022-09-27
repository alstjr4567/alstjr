package class_2;

public class ClassMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성
		String b = "apple";
		if(a==b)System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b))System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(a==b)System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if(a.equals(b))System.out.println("c와 d의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2022 + 9 + 27;
		System.out.println("e = "+e);
		System.out.println("문자열 크기 ="+e.length());
		for(int i= 0; i<e.length();i++) {
			System.out.println(i+":"+e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출="+e.substring(7));
		System.out.println("부분 문자열 추출="+e.substring(7,11));
		
		System.out.println("대문자 변경 ="+"Hello".toUpperCase());
		System.out.println("소문자 변경 ="+"Hello".toLowerCase());
		
		System.out.println("문자열 검색="+e.indexOf("짜"));
		System.out.println("문자열 검색="+e.indexOf("날짜"));
		System.out.println("문자열 검색="+e.indexOf("개바부")); // -1
		
		System.out.println("문자열 치환 = "+ e.replace("날짜","일자"));
		
	}
}
/*
heap(힙)영역이 잡힘.
- 이름부여(x), 주소
- 생성,삭제(는 jvm)

싱글톤 중요
싱글톤의 가장 대표적인 게 String이다
db할땐 

문자열은 편집이 안되므로 메모리 4번 생성된다
JVM에 의해서 삭제시 Garbage Collector로 보낸다
Garbage Collector가 실행되면 컴퓨터는 멈춘다.

"오늘 날짜는 "
"오늘 날짜는 2022
"오늘 날짜는 202209"
		0
e ---> " 오늘 날짜는 20220927"


*/