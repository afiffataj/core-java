class School{
	static String name;
	static int students;
	static short classrooms;
	static long schoolCode;
	static char grade;
	static float area;
	static boolean isOpen;
	static double fees;

	public static void main(String[] args){
		System.out.println("School is used for education");

		int teachers=50;
		String location="Bangalore";
		byte branches=3;
		char section='A';

		System.out.println("name="+School.name);
		System.out.println("students="+School.students);
		System.out.println("classrooms="+School.classrooms);
		System.out.println("schoolCode="+School.schoolCode);
		System.out.println("grade="+School.grade);
		System.out.println("area="+School.area);
		System.out.println("isOpen="+School.isOpen);
		System.out.println("fees="+School.fees);
		System.out.println(teachers);
		System.out.println(location);
		System.out.println(branches);
		System.out.println(section);
	}
}