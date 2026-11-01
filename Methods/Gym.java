class Gym {
    public static void main(String[] args) {

        System.out.println("Is Gym Open");
        Gym.isGymOpen();

        System.out.println("Is Trainer Available");
        Gym.isTrainerAvailable();

        System.out.println("Gym Grade");
        char grade = Gym.getGymGrade();
        System.out.println(grade);

        System.out.println("Are All Equipments Available");
        boolean equipment = Gym.areAllEquipmentsAvailable();
        System.out.println(equipment);

        System.out.println("Gym Name");
        Gym.getGymName("Fitness World");

        System.out.println("Membership Fees");
        Gym.getMembershipFees(1500, 2500);

        System.out.println("Equipment Names");
        Gym.getEquipmentNames("Treadmill", "Dumbbell", "Cycle");

        System.out.println("Gym Height");
        float height = Gym.getGymHeight(25.5f);
        System.out.println(height);

        System.out.println("Equipment Weights");
        double weight = Gym.getEquipmentWeights(10.5, 20.5);
        System.out.println(weight);

        System.out.println("Machine Numbers");
        int number = Gym.getMachineNumbers(11, 22, 33);
        System.out.println(number);
    }

    static void isGymOpen() {
        System.out.println("Yes Gym is Open");
    }

    static void isTrainerAvailable() {
        System.out.println("Yes Trainer is Available");
    }

    static char getGymGrade() {
        return 'A';
    }

    static boolean areAllEquipmentsAvailable() {
        return true;
    }

    static void getGymName(String name) {
        System.out.println(name);
    }

    static void getMembershipFees(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getEquipmentNames(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getGymHeight(float height) {
        return height;
    }

    static double getEquipmentWeights(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getMachineNumbers(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}