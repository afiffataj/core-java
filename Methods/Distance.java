class Distance {
    public static void main(String[] args) {

        System.out.println("Are the distances available");

        float distance = 12.5f;
        float distance1 = 20.8f;

        Distance.areTheDistancesAvailable(distance, distance1);
    }

    static void areTheDistancesAvailable(float a, float b) {
        System.out.println(a);
        System.out.println(b);
    }
}