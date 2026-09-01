class Library
{
    public static void issue(String bookName, String author,
	int days, boolean member)
    {
        System.out.println("Book Name=" + bookName);
        System.out.println("Author=" + author);
        System.out.println("Days=" + days);
        System.out.println("Member=" + member);

        if(bookName == null || author == null || days <= 0 ||
		member == false)
        {
            System.out.println("Invalid Data");
        }
        else
        {
            System.out.println("Valid Data");
        }
    }
}