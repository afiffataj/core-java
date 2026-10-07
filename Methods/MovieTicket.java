class MovieTicket{
	public static void main(String[] args){
		
		System.out.println("Open booking app");
		MovieTicket.didPersonOpenBookingApp();
		System.out.println("Select Movie");
		MovieTicket.didPersonSelectedMovieorNot();
		System.out.println("Select city");
		MovieTicket.didPersonSelectCityorNot();
		System.out.println("Select Show time");
		MovieTicket.didPersonSelectShowTimeorNot();
		System.out.println("Select seats");
		MovieTicket.didPersonSelectSeatsorNot();
		System.out.println("Confirm Details");
		MovieTicket.didPersonConfirmDetailsorNot();
		System.out.println("Make Payments");
		MovieTicket.didPersonMakePayment();
		System.out.println("Booking Confirmed");
		MovieTicket.isBookingGotConfirmedOrNot();
		System.out.println("Receive QR Code");
		MovieTicket.didPersonRecieveQRCodeorNot();
	}
	
	static void didPersonOpenBookingApp(){
		System.out.println("Yes person opened the booking app");
	}
	static void didPersonSelectedMovieorNot(){
		System.out.println("Yes person selected movie spiderman");
	}
	static void didPersonSelectCityorNot(){
		System.out.println("Yes person selected city mumbai");
	}
	static void didPersonSelectShowTimeorNot(){
		System.out.println("Yes the person selected show time at morning 8");
	}
	static void didPersonSelectSeatsorNot(){
		System.out.println("Yes person selected H3 seats");
	}
	static void didPersonConfirmDetailsorNot(){
		System.out.println("Yes person confirmed details");
	}
	static void didPersonMakePayment(){
		System.out.println("Yes person made payment throught phonePay");
	}
	static void isBookingGotConfirmedOrNot(){
		System.out.println("Yes person booking got confirmed");
	}
	static void didPersonRecieveQRCodeorNot(){
		System.out.println("Yes person recieved Qr code in phone");
	}
}