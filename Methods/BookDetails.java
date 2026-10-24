class BookDetails {
    public static void main(String[] args) {

        System.out.println("The book details");

        String title = "Java";
        short pages = 250;
        long code = 123456L;
        char section = 'B';

        BookDetails.display(title, pages, code, section);
    }

    static String display(String a, short b, long c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}