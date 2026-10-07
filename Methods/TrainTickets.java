class TrainTickets{
	public static void main(String[] args){
		
		System.out.println("Open booking app");
		TrainTickets.didPersonOpenBookingApp();
		
		System.out.println("Enter from & to");
		TrainTickets.didPersonEnterFromAndTo();
		
		System.out.println("Select date");
		TrainTickets.didPersonSelectedDate();
		
		System.out.println("Select Train");
		TrainTickets.didPersonSelectedTrain();
		
		System.out.println("Select Class");
		TrainTickets.didPersonSelectedClass();
		
		System.out.println("Enter Passenger Details");
		TrainTickets.didPersonEnterPassengerDetails();
		
		System.out.println("Make Payment");
		TrainTickets.didPersonMakePayment();
		
		System.out.println("Booking confirmed");
		TrainTickets.isPersonBookingGotConfirmed();
		
		System.out.println("Receive ticket");
		TrainTickets.didPersonRecieveTrainTickets();
	}
	static void didPersonOpenBookingApp(){
		System.out.println("Yes person opened booking app");
	}
	static void didPersonEnterFromAndTo(){
		System.out.println("Yes person entered from and too");
	}
	static void didPersonSelectedDate(){
		System.out.println("Yes person selected date as oct-7");;
	}
	static void didPersonSelectedTrain(){
		System.out.println("Yes person selected train");
	}
	static void didPersonSelectedClass(){
		System.out.println("Yes person selected class A");
	}
	static void didPersonEnterPassengerDetails(){
		System.out.println("Yes person entered passenger details");
	}
	static void didPersonMakePayment(){
		System.out.println("Yes person made payment through google pay");
	}
	static void isPersonBookingGotConfirmed(){
		System.out.println("Yes person booking got confirmed");
	}
	static void didPersonRecieveTrainTickets(){
		System.out.println("Yes person received train tickets");
	}
}
	
	
	