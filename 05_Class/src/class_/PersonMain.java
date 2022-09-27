package class_;
class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n,int a) {
		name = n;
		age = a;
	}
	public void setData() {
		
	}
}
//------------------
public class PersonMain {

	public static void main(String[] args) {
		Person aa; //클래스형 변수를 객체라 칭함.
		aa = new Person(); //메모리 생성
		System.out.println("객체 aa= " + aa);
		
		aa.setName ("홍길동");
		aa.setAge (25);
		String getName = null;
		System.out.println("이름 = "+getName+"\t나이 = " + " + "+aa.getName());
		
		
		Person bb = new Person(); //bb가 객체주인임
		System.out.println("객체 bb= " + bb);
		
		bb.setName ("코난");
		bb.setAge(13);
		System.out.println("이름 = "+getName+"\t나이 = " + " + "+bb.getAge());
		
		Person cc = new Person();
		System.out.println("객체 cc = "+ cc);
		cc.setData("둘리",100);
		System.out.println("이름 = "+getName+"\t나이 = " + " + "+cc.getAge());
		
		Person dd = new Person();
		System.out.println("객체 cc = "+ cc);
		cc.setData();
		System.out.println("이름 = "+getName+"\t나이 = " + " + "+dd.getAge());
	}
}
/*

*/