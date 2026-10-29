class BuildingDetails {
    public static void main(String[] args) {

        System.out.println("The building details");

        String name = "Sky Tower";
        int floors = 25;
        double height = 120.5;
        boolean completed = false;

        BuildingDetails.display(name, floors, height, completed);
    }

    static String display(String a, int b, double c, boolean d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}