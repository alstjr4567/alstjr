package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		boolean a = false;
		System.out.println("a = "+a);
		
		char b = 'A';
		System.out.println("b = "+b);
		
		char c = 65535; // 받을수있는 최대값 65535 이걸초과하면 커버할수 없으면 int형으로 넘겨버린다.
		System.out.println("c = "+c);
		
		//byte d = 128; //byte 최대값은 127 이걸넘기면 int로 바꿔야함
		int e = 65;
		System.out.println("e = "+e);
		
		int f =  'A';
		System.out.println("f = "+f);
		
		long g= 65L; // 65L은 long형 상수
		
		float h = 43.8f; //모든 실수는 double형 상수로 인식함 float으로 하고싶으면 f를 뒤에 붙여야함
		//float h = 43.8; 43.8은 double형이기에 (에러뜸)
		float h2 = (float)43.8; //강제형변환으로 float형됨(에러안뜸)
		System.out.println("h = "+h);
		System.out.println("h = "+h2);
	
	}
}
/*
대입문 : 오른쪽에 있는 값을 왼쪽에 집어넣어라.
모든 실수는 double형 상수로 인식함 float으로 하고싶으면 f를 뒤에 붙여야함


*/