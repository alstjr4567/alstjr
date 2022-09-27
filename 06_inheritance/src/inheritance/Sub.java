package inheritance;

public class Sub extends Super {
	protected String name;
	protected int age;
	
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	public Sub(String name, int age, double weight, double height){
		System.out.println("Sub 생성자(일반생성자)");
		this.name=name;
		this.age=age;
		super.weight=height;
		super.height=height;
//		this.weight=weight;
//		this.height=height;
	}
	public void output() {
		System.out.println("이름 ="+ name);
		System.out.println("나이 = " + age );
		System.out.println("몸무게 = " + height );
		System.out.println("키 = " + height );
	}
public static void main(String[] args) {
	Sub aa = new Sub("홍길동",25,70.5,182.3);
	aa.disp();
	System.out.println();
	aa.output();
	//내것도 내것 부모것도 내것
	//우선은 나한태서 찾고 없으면 부모걸 찾는다.
	System.out.println("-------------");
	
	Super bb = new Sub("코난", 13, 35.6, 152.7);
	bb.disp();
	}
}
/*
자식생성자 만들면 부모것까지 같이 만든다.
부모것일때 super를 this대신 써도됨
*/
