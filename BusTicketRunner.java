class BusTicketRunner
{
    public static void main(String[] args)
    {
		String from="tumkur";
		String to="tamil naidu";
		int age=15;
		String address="jp nagar";
        int pincode=560063;
		String paymentType="cash";
		String bookingLocation="counter";
BusTicket.book(from,to,age,address,pincode,paymentType,bookingLocation);
		
BusTicket.book("Bangalore","Mysore",25,"BTM",560076,
                "UPI","Online");

BusTicket.book("Bangalore","Hubli",2,"BTM",560076,
               "Cash","Counter");
    }
}