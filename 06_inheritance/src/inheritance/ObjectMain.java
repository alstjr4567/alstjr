package inheritance;
class Test extends Object {
	
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
}
public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+t);
		System.out.println("객체 t = "+t.toString());
		System.out.println("객체 t = "+t.hashCode());//주소의 값을 나오게 하는것.
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+ (aa==bb)); //주소물어보는것 이기에  false
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//문자열 - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : "+ (cc==dd));//주소 - false
		System.out.println("cc.equals(dd) : "+cc.equals(dd));// 주소 - false
		System.out.println();
		
		Object ee = new Object();
		Object ff = new Object();
		System.out.println("ee == ff : "+ (cc==dd));//주소 - false
		System.out.println("ee.equals(dd) : "+ee.equals(ff));// 문자열 - true
		System.out.println();
		
	}
}
/*
class Object {
   public boolean equals(Object )   참조값 비교
   public int hashCode()         10진수
   public String toString()      클@16진수
}

class Test extends Object {
   public String toString()   개바부
}

class String extends Object {
   public int hashCode()         문자열을 10진수 변환, 믿지 마삼
                           표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할 수 없다
   public String toString()      문자열
   public boolean equals(Object )   문자열 비교
}

*/