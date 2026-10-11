class College {
    static String collegeName = "ABC Engineering College";
    static String location = "Bengaluru";
    static int totalDepartments = 8;
    static int totalStudents = 2500;
    static String affiliation = "VTU";

    public static void main(String[] args) {
        String studentName = "Kiran";
        int studentAge = 20;
        double percentage = 85.5d;
        long registerNo = 4567890123l;
        String branch = "Computer Science";

        System.out.println(College.collegeName);
        System.out.println(College.location);
        System.out.println(College.totalDepartments);
        System.out.println(College.totalStudents);
        System.out.println(College.affiliation);
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(percentage);
        System.out.println(registerNo);
        System.out.println(branch);
    }
}
