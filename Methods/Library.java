class Library {
    public static void main(String[] args) {

        System.out.println("Is library open");
        Library.isLibraryOpen();
        Library.isLibraryOpen();
        Library.isLibraryOpen();

        System.out.println("Is book borrowing available");
        Library.isBookBorrowingAvailable();
        Library.isBookBorrowingAvailable();
        Library.isBookBorrowingAvailable();

        System.out.println("Is internet available");
        Library.isInternetAvailable();
        Library.isInternetAvailable();
        Library.isInternetAvailable();

        System.out.println("Is a reading room available");
        Library.isReadingRoomAvailable();
        Library.isReadingRoomAvailable();
        Library.isReadingRoomAvailable();

        System.out.println("Library name");
        System.out.println(Library.getLibraryName());
        System.out.println(Library.getLibraryName());
        System.out.println(Library.getLibraryName());

        System.out.println("Membership fee");
        System.out.println(Library.getMembershipFee());
        System.out.println(Library.getMembershipFee());
        System.out.println(Library.getMembershipFee());

        System.out.println("Number of books");
        System.out.println(Library.getNumberOfBooks());
        System.out.println(Library.getNumberOfBooks());
        System.out.println(Library.getNumberOfBooks());

        System.out.println("Library location");
        System.out.println(Library.getLibraryLocation());
        System.out.println(Library.getLibraryLocation());
        System.out.println(Library.getLibraryLocation());
    }

    static void isLibraryOpen() {
        System.out.println("Yes, the library is open");
    }

    static void isBookBorrowingAvailable() {
        System.out.println("Yes, book borrowing is available");
    }

    static void isInternetAvailable() {
        System.out.println("Yes, internet is available");
    }

    static void isReadingRoomAvailable() {
        System.out.println("Yes, the reading room is available");
    }

    static String getLibraryName() {
        return "Knowledge Hub Library";
    }

    static int getMembershipFee() {
        return 1000;
    }

    static int getNumberOfBooks() {
        return 10000;
    }

    static String getLibraryLocation() {
        return "Dharwad";
    }
}