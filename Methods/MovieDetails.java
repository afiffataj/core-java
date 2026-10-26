class MovieDetails {
    public static void main(String[] args) {

        System.out.println("The movie details");

        String title = "Inception";
        double rating = 8.8;
        int duration = 148;
        char category = 'A';

        MovieDetails.display(title, rating, duration, category);
    }

    static String display(String a, double b, int c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}