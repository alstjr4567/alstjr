package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Compute[] ar = new Compute[3]; //객체배열 생성 Compute외에 다른클래스 들어오면 안됨.
//		Compute aa = new Compute();
//		Compute bb = new Compute(); 이렇게 만들걸 위처럼 배열로 생성함
//		Compute cc = new Compute();
		
		//결합도 100%(상속)  ex)삼성, lg, 소니 Tv가있으면 삼성리모콘,lg리모콘,소니리모콘 이렇게 각각사용하면 결함도 100
		// 낮은 결합도(부모)하지만 만능리모콘으로 삼성,lg,소니 티비를 한번에 조종하면 결합도가 낮은것
		//객체배열 생성 오브젝트(최상위클래스) 모든 객체다받아주겠다.
		
		Compute[] ar = new Compute[3]; 
		ar[0]= new Compute();
		ar[1]= new Compute(); 
		ar[2]= new Compute();
		//결합도 100%
		
		for(int i=0; i<ar.length; i++) {
			System.out.print("x 입력 :");
			int x = sc.nextInt();
			ar[i].setX(x);
			
			System.out.print("x 입력 :");
			int y = sc.nextInt();
			ar[i].setY(y);
			
			ar[i].calc();
			
		}
		System.out.println("X\tY\tSum\tSub\tMul\tDiv");
		for(Compute data : ar) {
			System.out.println(data.getX()+"\t"
					+data.getY()+"\t"
					+data.getSum()+"\t"
					+data.getSub()+"\t"
					+data.getMul()+"\t"
					+data.getDiv()+"\t"
					);
		}
		
//		System.out.print("x 입력 :");
//		int a = sc.nextInt();
//		System.out.print("y 입력 :");
//		int b = sc.nextInt();
//		c.setX(a); //setX로 위에 입력값 a를 전달
//		c.setY(b); //setY로 위에 입력값 b를 전달
//		
//		System.out.println("[실행결과]");
//		System.out.println("x 입력 :"+ㅁ.getX());
//		System.out.println("y 입력 :"+c.getY());
		
		
	}
}
