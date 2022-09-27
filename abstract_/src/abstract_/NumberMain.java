package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); //3자리마다 쉼표를 찍고 싶을때
		//new가 안됨 추상클래스라
		NumberFormat nf = new DecimalFormat();// 위 넘버포멧의 자식임.소수이하 3째자리 까지 나옴
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌것은 표현하지 않는다.
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
	
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시 클래스도 메소드로 생성이 가능하다.
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		nf4.setMaximumFractionDigits(2);//소수이하 2째자리까지 나옴
		nf4.setMaximumFractionDigits(2);//0을 강제로 표시
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getInstance(Locale.US); //메소드 이용
		//클래스도 메소드로 생성이 가능하다.
		nf4.setMaximumFractionDigits(2);//소수이하 2째자리까지 나옴
		nf4.setMaximumFractionDigits(2);//0을 강제로 표시
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = new NumberFormat(); //메소드 이용
		//클래스자체를 상속관계가 아니라 메소드를 이용해서 사용해도됨.
	}
}
