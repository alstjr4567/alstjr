package 연습장;
class Calculator{
	int x;
	int y;
	
	static int add(int a,int b) {
		return a+b;//바로 리턴해도됨 변수에 안담아도 됨
	
	}
	static int multiply(int a,int b) {
		int c = a*b;
		System.out.println("c : "+c);//굳이 필요없음
		return c;  
	}
}
public class 클래스_메서드02 {

	public static void main(String[] args) {
		//add(10,20);  
		Calculator c1 = new Calculator();  //다른클래스 메서드쓰고 싶을땐 참조변수(객체)를 써서 호출함.
		c1.x=100;
		c1.y=200;
		
		int result = c1.add(10, 20); 
		System.out.println("result :"+result);
		
//		int result2 =c1.multiply(5, 6);
//		System.out.println("result2 :"+result2);// 객체로 접근
		int result2 =Calculator.multiply(5, 6); //클래스변수로 static스테틱은 클래스변수로 접근 가능하다.
		System.out.println("result2 :"+result2);
		
		int result3 = sub(100,11,22);//같은 클래스 메서드 호출
		System.out.println("result3 : "+result3);
		
	}//main
	
	static int sub(int x,int y,int z) {
		int result3 = x - y - z;
		return result3;
		//return x-y-z; 이렇게 해도됨
	}
}
/*
 static스테틱이 붙으면 참조변수(객체)로 호출할수있고
  				  클래스변수로도 호출할수있다.
 
 */
