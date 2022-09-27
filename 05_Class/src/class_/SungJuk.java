package class_;

public class SungJuk {
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private char grade;
	
	public void setData(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}//set를 한번에 만들엇음 아래 get는 한번에 못만들어서 따로 만듦
	
	public void calc() {
		tot = kor+eng+math;
		avg = (double)tot / 3;
		if(avg>=90)
			grade = 'A';
		else if(avg>=80)
			grade = 'B';
		else if(avg>=70)
			grade = 'C';
		else if(avg>=60)
			grade = 'D';
		else
			grade = 'F';
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public String getAvg() {
		return String.format("%.2f", avg);
	}
	public char getGrade() {
		return grade;
	}
}











