class LibrarySystem {
    public static void main(String[] args) {

        System.out.println("Library Details");

        long bookId = 123456L;
        long bookId1 = 789012L;

        LibrarySystem.printBookIds(bookId, bookId1);
        LibrarySystem.printBookNames("Java", "Python");
    }

    static void printBookIds(long a, long b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printBookNames(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}