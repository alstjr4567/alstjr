package variable;

import java.text.DecimalFormat;

public class CalcTest {
	
	public static void main(String[] args) {
//		int a=320,b=258;
//		int sum = a + b ;
//		System.out.println("320 + 258 = "+ sum);
		
		short a = 320;
		short b = 258;
		short sum = (short)(a + b);
		short sub = (short)(a - b);
		int mul = a * b;
		double div = (double )a / b; // 앞에서 강제형변환이 일어나면 뒤는 자동형변환됨/ 소숫점 15자리까지 나옴 15자리 넘어가면 잘라버림
		

		System.out.println(a +" + "+ b +" = " + sum);
		System.out.println(a +" - "+ b +" = " + sub);
		System.out.println(a +" * "+ b +" = " + mul);
		//System.out.println(a +" / "+ b +" = " + div);
		
		System.out.println(a +" / "+ b +" = " + new DecimalFormat().format(mul));
		//mul은 숫자3자리마다 쉼표찍어준다.
		System.out.println(a +" / "+ b +" = " + String.format("%7.5f", div));
		// %f : 실수형으로 바뀌어서 처리함(%전체자리수.소수점자리수f)
		
	}
}
/*
[문제] 변수를 이용하여 320, 258의 합(sum),차(sub),곱(mul),몫(div)을 구하시오
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = 1.24031007751938

실수형은 소숫점 15자리까지 나옴 15자리 넘어가면 잘라버림
 */
