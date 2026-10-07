class Rapido{
	public static void main(String[] args){
		
		System.out.println("Open Rapido app");
		Rapido.didPersonOpenRapidoAppOrNot();
		System.out.println("Enter pickup location");
		Rapido.personEnteredPickupLocationOrNot();
		System.out.println("Enter destination");
		Rapido.didPersonEnteredDestination();
		System.out.println("Select Bike/Auto/Cab");
		Rapido.didPersonSelectBikeOrAutoOrCab();
		System.out.println("Check fare");
		Rapido.isTheCheckFare();		
		System.out.println("Confirm booking");
		Rapido.didPersonConfirmBooking();
		System.out.println("Driver assigned");
		Rapido.didDriverGotAssigned();
		System.out.println("Track driver");
		Rapido.PersonCanTrackDriverOrNot();
		System.out.println("Start ride");
		Rapido.didTheDriverStartRideOrNot();
		System.out.println("Complete ride");
		Rapido.didTheDriverCompletedTheRideOrNot();
		System.out.println("Pay");
		Rapido.didThePersonPayTheAmount();
		System.out.println("Rate driver");
		Rapido.didThePersonRateTheDriverOnStars();
	}	
		static void didPersonOpenRapidoAppOrNot(){
			System.out.println("Yes person opened rapido app");
		}
		static void personEnteredPickupLocationOrNot(){
			System.out.println("Yes person entered pickup location");
		}
		static void didPersonEnteredDestination(){
			System.out.println("Yes person entered destination");
		}
		static void didPersonSelectBikeOrAutoOrCab(){
			System.out.println("Yes the person choosed auto");
		}
		static void isTheCheckFare(){
			System.out.println("Yes person checked fare");
		}
		static void didPersonConfirmBooking(){
			System.out.println("Yes person confirmed booking");
		}
		static void didDriverGotAssigned(){
			System.out.println("Yes driver got assigned");
		}
		static void PersonCanTrackDriverOrNot(){
			System.out.println("Yes person track driver location");
		}
		static void didTheDriverStartRideOrNot(){
			System.out.println("Yes the driver started ride");
		}
		static void didTheDriverCompletedTheRideOrNot(){
			System.out.println("Yes the driver competed the ride");
		}
		static void didThePersonPayTheAmount(){
			System.out.println("Yes the person payed the amount");
		}
		static void didThePersonRateTheDriverOnStars(){
			System.out.println("Yes the person rated the driver on 4.5 stars");
		}
	}