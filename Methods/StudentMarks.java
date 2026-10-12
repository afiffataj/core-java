class StudentMarks {
    public static void main(String[] args) {

        System.out.println("Marks for 1 subject");
        int maths = 85;
        StudentMarks.marksFor1Subject(maths);

        System.out.println("Marks for 2 subjects");
        int physics = 90;
        int chemistry = 80;
        StudentMarks.marksFor2Subjects(physics, chemistry);

        System.out.println("Marks for 3 subjects");
        int english = 75;
        int biology = 88;
        int computer = 95;
        StudentMarks.marksFor3Subjects(
            english, biology, computer
        );

        System.out.println("Marks for 4 subjects");
        int history = 70;
        int geography = 82;
        int economics = 89;
        int science = 91;
        StudentMarks.marksFor4Subjects(
            history, geography, economics, science
        );

        System.out.println("Marks for 5 subjects");
        int kannada = 86;
        int hindi = 78;
        int social = 84;
        int drawing = 92;
        int sports = 96;
        StudentMarks.marksFor5Subjects(
            kannada, hindi, social, drawing, sports
        );
    }

    static void marksFor1Subject(int a) {
        System.out.println("Maths marks = " + a);
    }

    static void marksFor2Subjects(int b, int c) {
        System.out.println("Physics marks = " + b);
        System.out.println("Chemistry marks = " + c);
    }

    static void marksFor3Subjects(int d, int e, int f) {
        System.out.println("English marks = " + d);
        System.out.println("Biology marks = " + e);
        System.out.println("Computer marks = " + f);
    }

    static void marksFor4Subjects(int g, int h, int i, int j) {
        System.out.println("History marks = " + g);
        System.out.println("Geography marks = " + h);
        System.out.println("Economics marks = " + i);
        System.out.println("Science marks = " + j);
    }

    static void marksFor5Subjects(
        int k, int l, int m, int n, int o) {

        System.out.println("Kannada marks = " + k);
        System.out.println("Hindi marks = " + l);
        System.out.println("Social marks = " + m);
        System.out.println("Drawing marks = " + n);
        System.out.println("Sports marks = " + o);
    }
}
