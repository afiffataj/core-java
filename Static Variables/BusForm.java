class BusForm{
	static String busCompany="City Travels";
	static String busRoute="Bangalore to Mysore";
	static int busNumber=2456;
	static boolean acAvailable=true;
	static String departureTime="7AM";

	public static void main(String[] args){
		System.out.println("BusForm is important");

		String passengerName;
		int passengerAge;
		String seatNumber;
		String ticketType;
		int ticketPrice;

		System.out.println("1st Passenger");
		passengerName="Manoj";
		passengerAge=28;
		seatNumber="A12";
		ticketType="Regular";
		ticketPrice=450;

		System.out.println("busCompany="+BusForm.busCompany);
		System.out.println("busRoute="+BusForm.busRoute);
		System.out.println("busNumber="+BusForm.busNumber);
		System.out.println("acAvailable="+BusForm.acAvailable);
		System.out.println("departureTime="+BusForm.departureTime);
		System.out.println("passengerName="+passengerName);
		System.out.println("passengerAge="+passengerAge);
		System.out.println("seatNumber="+seatNumber);
		System.out.println("ticketType="+ticketType);
		System.out.println("ticketPrice="+ticketPrice);
		System.out.println();

		System.out.println("2nd Passenger");
		passengerName="Divya";
		passengerAge=24;
		seatNumber="B08";
		ticketType="AC";
		ticketPrice=650;

		System.out.println("busCompany="+BusForm.busCompany);
		System.out.println("busRoute="+BusForm.busRoute);
		System.out.println("busNumber="+BusForm.busNumber);
		System.out.println("acAvailable="+BusForm.acAvailable);
		System.out.println("departureTime="+BusForm.departureTime);
		System.out.println("passengerName="+passengerName);
		System.out.println("passengerAge="+passengerAge);
		System.out.println("seatNumber="+seatNumber);
		System.out.println("ticketType="+ticketType);
		System.out.println("ticketPrice="+ticketPrice);
		System.out.println();

		System.out.println("3rd Passenger");
		passengerName="Naveen";
		passengerAge=35;
		seatNumber="C15";
		ticketType="Sleeper";
		ticketPrice=800;

		System.out.println("busCompany="+BusForm.busCompany);
		System.out.println("busRoute="+BusForm.busRoute);
		System.out.println("busNumber="+BusForm.busNumber);
		System.out.println("acAvailable="+BusForm.acAvailable);
		System.out.println("departureTime="+BusForm.departureTime);
		System.out.println("passengerName="+passengerName);
		System.out.println("passengerAge="+passengerAge);
		System.out.println("seatNumber="+seatNumber);
		System.out.println("ticketType="+ticketType);
		System.out.println("ticketPrice="+ticketPrice);
	}
}
