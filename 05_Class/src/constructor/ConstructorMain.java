package constructor;

class Hello{
	private String name;
	private int age;
	
	public Hello() { //void리턴타입 쓰면 안됨.
		System.out.println("기본 생성자");
		
	}
	public Hello(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		
		//this("코난");
		this.age = age;
	}
	public int getAge1() {
		return age;
	}
	

//-------
public class ConstructorMain {
		private void mian(String[] args) {
			Hello aa = new Hello();
			System.out.println(aa.getName());
			System.out.println();
			
			Hello bb =new Hello("홍길동");
			System.out.println(bb.getName());
			System.out.println();
			
			Hello cc = new Hello();
			System.out.println(bb.getName()+"\t"+aa.getAge1());
		}
}
}
