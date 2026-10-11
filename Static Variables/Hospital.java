class Hospital {
    static String hospitalName = "City Care";
    static String location = "Mysuru";
    static int totalBeds = 300;
    static int totalDoctors = 85;
    static String hospitalType = "Multi-Speciality";

    public static void main(String[] args) {
        String patientName = "Anil";
        int patientAge = 35;
        double billAmount = 12500.50d;
        long patientId = 4567890123l;
        String department = "Cardiology";

        System.out.println(Hospital.hospitalName);
        System.out.println(Hospital.location);
        System.out.println(Hospital.totalBeds);
        System.out.println(Hospital.totalDoctors);
        System.out.println(Hospital.hospitalType);
        System.out.println(patientName);
        System.out.println(patientAge);
        System.out.println(billAmount);
        System.out.println(patientId);
        System.out.println(department);
    }
}
