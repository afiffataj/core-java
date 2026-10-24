class Status {
    public static void main(String[] args) {

        System.out.println("The status");

        boolean a = true;
        boolean b = true;

        Status.display(a, b);
    }

    static boolean display(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}