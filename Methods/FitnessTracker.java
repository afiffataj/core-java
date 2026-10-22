class FitnessTracker {
    public static void main(String[] args) {

        System.out.println("Fitness Details");

        short dailySteps = 5000;
        short dailySteps1 = 8000;

        FitnessTracker.printDailySteps(dailySteps, dailySteps1);
        FitnessTracker.printActivityTypes('R', 'W');
    }

    static void printDailySteps(short a, short b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printActivityTypes(char a, char b) {
        System.out.println(a);
        System.out.println(b);
    }
}