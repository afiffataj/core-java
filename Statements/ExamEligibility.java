class ExamEligibility {
    public static void main(String[] args) {

        System.out.println("Minimum attendance required");
        int attendance = 85;

        if(attendance >= 75) {
            System.out.println("Student is eligible to attend the exam");
        }
        else {
            System.out.println("Student is not eligible to attend the exam");
        }
    }
}