class SchoolManagement {
    public static void main(String[] args) {

        System.out.println("School Details");

        int studentId = 101;
        int studentId1 = 102;

        SchoolManagement.printStudentIds(studentId, studentId1);
        SchoolManagement.printStudentNames("Ravi", "Kiran");
        SchoolManagement.printStudentGrades('A', 'B');
    }

    static void printStudentIds(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printStudentNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printStudentGrades(char a, char b) {
        System.out.println(a);
        System.out.println(b);
    }
}