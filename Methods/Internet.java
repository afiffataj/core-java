class Internet {
    public static void main(String[] args) {

        System.out.println("Is the internet connection available");

        boolean connection = true;
        boolean connection1 = false;

        Internet.isTheInternetConnectionAvailable(connection, connection1);
    }

    static void isTheInternetConnectionAvailable(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}