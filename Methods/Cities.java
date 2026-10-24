class Cities {
    public static void main(String[] args) {

        System.out.println("The city names");

        String a = "Bengaluru";
        String b = "Chennai";

        Cities.display(a, b);
    }

    static String display(String a, String b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}