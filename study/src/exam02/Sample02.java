package exam02;

public class Sample02 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("총점 : " + s1.getTotal());
		System.out.printf("평균 : %.2f\n", s1.getAverage());
		
		Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s2.info());
	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public float getAverage() {
		return getTotal() / 3f;
	}
	
	// 보슬
//	float getAverage() {
//        float result = Math.round(((float)this.getTotal() / 3) * 10) / (float)10;
//        return result;
//	}
	
	public String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + getTotal() + ", " + getAverage();
		
		// 보슬
//      StringBuilder result = new StringBuilder();
//      result.append(name + ", ");
//      result.append(ban+ ", ");
//      result.append(no+ ", ");
//      result.append(kor+ ", ");
//      result.append(eng+ ", ");
//      result.append(math+ ", ");
//      result.append(this.getTotal()+ ", ");
//      result.append(this.getAverage());
//      return result;
	}
	
	// 유라
//	public class Ch06_Student {
//
//	    public static void main(String[] args) {
//	        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//
//	        System.out.println("이름 : " + s.name);
//	        System.out.println("총점 : " + s.getTotal());
//	        System.out.println("평균 : " + s.getAverage());
//
//
//	        System.out.println(s.info());
//
//
//	    }
//
//	}
//
//	class Student {
//	    String name; // 학생 이름
//	    int ban;     // 반
//	    int no;      // 번호
//	    int kor;     // 국어 점수
//	    int eng;     // 영어 점수
//	    int math;    // 수학 점수
//
//	    public Student(String name, int ban, int no, int kor, int eng, int math) {
//	        this.name = name;
//	        this.ban = ban;
//	        this.no = no;
//	        this.kor = kor;
//	        this.eng = eng;
//	        this.math = math;
//	    }
//
//	    public String info() {
//	        String info = name + ", " + ban + ", " + no + ", "
//	                + kor + ", " + eng + ", " + math + ", "
//	                + getTotal() + ", " + getAverage();
//	        return info;
//	    }
//
//	    public int getTotal() {
//	        int total = kor + eng + math;
//	        return total;
//	    }
//
//	    public String getAverage() {
//	        String average = String.format("%.1f", (float)getTotal() / 3);
//	        return average;
//	    }
}
