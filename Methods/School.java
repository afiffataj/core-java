class School {
    public static void main(String[] args) {

        System.out.println("Is school open");
        School.isSchoolOpen();
        School.isSchoolOpen();
        School.isSchoolOpen();

        System.out.println("Is library available");
        School.isLibraryAvailable();
        School.isLibraryAvailable();
        School.isLibraryAvailable();

        System.out.println("Are sports facilities available");
        School.areSportsFacilitiesAvailable();
        School.areSportsFacilitiesAvailable();
        School.areSportsFacilitiesAvailable();

        System.out.println("Are computer classes available");
        School.areComputerClassesAvailable();
        School.areComputerClassesAvailable();
        School.areComputerClassesAvailable();

        System.out.println("School name");
        System.out.println(School.getSchoolName());
        System.out.println(School.getSchoolName());
        System.out.println(School.getSchoolName());

        System.out.println("Annual fees");
        System.out.println(School.getAnnualFees());
        System.out.println(School.getAnnualFees());
        System.out.println(School.getAnnualFees());

        System.out.println("Number of classrooms");
        System.out.println(School.getNumberOfClassrooms());
        System.out.println(School.getNumberOfClassrooms());
        System.out.println(School.getNumberOfClassrooms());

        System.out.println("School location");
        System.out.println(School.getSchoolLocation());
        System.out.println(School.getSchoolLocation());
        System.out.println(School.getSchoolLocation());
    }

    static void isSchoolOpen() {
        System.out.println("Yes, the school is open");
    }

    static void isLibraryAvailable() {
        System.out.println("Yes, the library is available");
    }

    static void areSportsFacilitiesAvailable() {
        System.out.println("Yes, sports facilities are available");
    }

    static void areComputerClassesAvailable() {
        System.out.println("Yes, computer classes are available");
    }

    static String getSchoolName() {
        return "Bright Future School";
    }

    static int getAnnualFees() {
        return 45000;
    }

    static int getNumberOfClassrooms() {
        return 30;
    }

    static String getSchoolLocation() {
        return "Mysuru";
    }
}