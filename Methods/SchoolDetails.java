class SchoolDetails {
    public static void main(String[] args) {

        System.out.println("The school details");

        String name = "Sunrise";
        int students = 1200;
        long phone = 9876543210L;
        boolean recognized = true;

        SchoolDetails.display(name, students, phone, recognized);
    }

    static String display(String a, int b, long c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}