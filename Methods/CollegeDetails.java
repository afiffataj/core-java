class CollegeDetails {
    public static void main(String[] args) {

        System.out.println("The college details");

        String name = "ABC College";
        int students = 2500;
        char grade = 'A';
        boolean accredited = true;

        CollegeDetails.display(name, students, grade, accredited);
    }

    static String display(String a, int b, char c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}