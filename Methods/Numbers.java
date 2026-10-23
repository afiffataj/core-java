class Numbers {
    public static void main(String[] args) {

        System.out.println("The numbers");

        int a = 10;
        int b = 20;

        Numbers.display(a, b);
    }

    static int display(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}