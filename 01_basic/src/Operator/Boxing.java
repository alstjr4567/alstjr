package Operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3; //(double)캐스팅
		
		String c ="25";
		//int d = c; 기본형에서 객체형으로 캐스팅이 안되서 에러남
		int d = Integer.parseInt(c);// 객체는객체끼리 기본형은 기본형끼리 캐스팅이 됨
		
		
		//AutoBoxing - JDK 5.0부터 오토박싱 됬다.
		int e = 5;
		Integer f = e;
		//Integer g = new Integer(e); JDK 5.0이전 버전에는 이렇게 했음.
		
		Integer h = 5;
		int i = e;//unAutoBoxing
		//int j =e.intValue(); - JDK5.0버전
		
		
	}
}
/*
 형변환 = 캐스팅
 
*/
