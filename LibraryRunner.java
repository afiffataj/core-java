class LibraryRunner
{
    public static void main(String[] args)
    {
		String bookName="C++";
		String author="kelvin";
	    int days=2;
		boolean member=false;
		Library.issue(bookName,author,days,member);
		
        Library.issue("Java Programming","James",7,true);

        Library.issue("Python","Guido",5,true);

        Library.issue(null,null,0,false);
    }
}