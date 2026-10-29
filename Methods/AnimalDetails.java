class AnimalDetails {
    public static void main(String[] args) {

        System.out.println("The animal details");

        String name = "Tiger";
        int age = 5;
        float weight = 180.5f;
        boolean wild = true;

        AnimalDetails.display(name, age, weight, wild);
    }

    static String display(String a, int b, float c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}