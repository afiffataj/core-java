class Door {
    public static void main(String[] args) {
        System.out.println("Is the door grade available");

        char grade = 'A';
        char grade1 = 'B';

        Door.isTheDoorGradeAvailable(grade, grade1);
    }

    static void isTheDoorGradeAvailable(char a, char b) {
        System.out.println(a);
        System.out.println(b);
    }
}