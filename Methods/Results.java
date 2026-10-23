class Results {
    public static void main(String[] args) {

        System.out.println("The results");

        boolean a = true;
        boolean b = false;

        Results.display(a, b);
    }

    static boolean display(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}