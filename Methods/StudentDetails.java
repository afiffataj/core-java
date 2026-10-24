class StudentDetails {
    public static void main(String[] args) {

        System.out.println("The student details");

        String name = "Rahul";
        int age = 18;
        double marks = 85.5;
        char grade = 'A';

        StudentDetails.display(name, age, marks, grade);
    }

    static String display(String a, int b, double c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}