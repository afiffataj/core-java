class CourseDetails {
    public static void main(String[] args) {

        System.out.println("The course details");

        String course = "Java";
        int duration = 6;
        long courseCode = 123456L;
        boolean online = true;

        CourseDetails.display(course, duration, courseCode, online);
    }

    static String display(String a, int b, long c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}