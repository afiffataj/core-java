class Exam {
    public static void main(String[] args) {

        System.out.println("Are the exam marks available");

        short marks = 450;
        short marks1 = 475;

        Exam.areTheExamMarksAvailable(marks, marks1);
    }

    static void areTheExamMarksAvailable(short a, short b) {
        System.out.println(a);
        System.out.println(b);
    }
}