class HospitalManagement {
    public static void main(String[] args) {

        System.out.println("Hospital Details");

        int hospitalId = 101;
        int hospitalId1 = 102;

        HospitalManagement.printHospitalIds(hospitalId, hospitalId1);
        HospitalManagement.printHospitalNames("Apollo", "Fortis");
    }

    static void printHospitalIds(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printHospitalNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}