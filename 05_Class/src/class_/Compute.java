package class_;


public class Compute {
		private String name;
		private int x, y, sum,sub, mul;
		private double div;
		
		
		public void calc() {
			this.sum =this.x+this.y;
			sub = x -y;
			mul = x*y;
			div =(double)x/y;
		}
		
		///---------
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public int getSub() {
			return sub;
		}
		public void setSub(int sub) {
			this.sub = sub;
		}
		public int getMul() {
			return mul;
		}
		public void setMul(int mul) {
			this.mul = mul;
		}
		public double getDiv() {
			return div;
		}
		public void setDiv(double div) {
			this.div = div;
		}
		

		
	
		
		
		
		
	
	
}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/