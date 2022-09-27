package abstract_;

public abstract class AbstractTest {//POJO형식(Plain Old Java Object) 상속안받는다.
	protected String name;
	
	public String getName() {//구현
		return name;
	}

	public abstract void setName(String name); //추상메소드
	//추상메소드 는 추상 클래스여야 한다.
	
}
