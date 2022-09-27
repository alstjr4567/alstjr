package class_;

class This{
	public int a;
	
	public void setA(int a) {
		this.a = a; // this 없으면 자기것으로 인식함.this를 쓰면 틀래스 꺼라고 인식함
	}
	public int getA() {
		return a; // this가 생략내보내는 값
	}
}
//-------------
public class ThisMain {

	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체 t ="+t);
		t.setA(10); //10을 set으로 전달
		System.out.println(t.getA());
		
		System.out.println();
		This s = new This();
		System.out.println("객체 s ="+s);
		s.setA(20); //10을 set으로 전달
		System.out.println(s.getA());
		
	}
}
/*

*/