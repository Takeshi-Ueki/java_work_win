package lesson6_2;

public class StuSample {
	public static void main(String[] args) {
		Student stu1 = new Student("田中");
		//	Student stu2 = new Student("田中");
		Student stu2 = stu1;
		
		boolean result = stu1.equals(stu2);
		System.out.println(result);
		System.out.println(stu1);
	}
}
