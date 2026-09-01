class Mall{
	public static void main(String[] args){
		String movieName="spiderman";
		int quantity=5;
		String screen="2";
	    boolean discount=true;
		boolean orderSnacks=true;
		Theater.book(movieName,quantity,screen,discount,orderSnacks);
		Theater.book("obbsesion",11,"5",true,true);
	}
}