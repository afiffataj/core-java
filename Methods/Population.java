class Population {
    public static void main(String[] args) {

        System.out.println("The population count");

        long a = 100000L;
        long b = 200000L;

        Population.display(a, b);
    }

    static long display(long a, long b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}