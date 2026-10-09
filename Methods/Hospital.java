class Hospital {
	public static void main(String[] args) {

		System.out.println("Is hospital open");
		Hospital.isHospitalOpen();
		Hospital.isHospitalOpen();
		Hospital.isHospitalOpen();

		System.out.println("Are doctors available");
		Hospital.areDoctorsAvailable();
		Hospital.areDoctorsAvailable();
		Hospital.areDoctorsAvailable();

		System.out.println("Is emergency service available");
		Hospital.isEmergencyServiceAvailable();
		Hospital.isEmergencyServiceAvailable();
		Hospital.isEmergencyServiceAvailable();

		System.out.println("Is ambulance available");
		Hospital.isAmbulanceAvailable();
		Hospital.isAmbulanceAvailable();
		Hospital.isAmbulanceAvailable();

		System.out.println("Hospital name");
		System.out.println(Hospital.getHospitalName());
		System.out.println(Hospital.getHospitalName());
		System.out.println(Hospital.getHospitalName());

		System.out.println("Number of doctors");
		System.out.println(Hospital.getNumberOfDoctors());
		System.out.println(Hospital.getNumberOfDoctors());
		System.out.println(Hospital.getNumberOfDoctors());

		System.out.println("Number of beds");
		System.out.println(Hospital.getNumberOfBeds());
		System.out.println(Hospital.getNumberOfBeds());
		System.out.println(Hospital.getNumberOfBeds());

		System.out.println("Hospital location");
		System.out.println(Hospital.getHospitalLocation());
		System.out.println(Hospital.getHospitalLocation());
		System.out.println(Hospital.getHospitalLocation());
	}

	static void isHospitalOpen() {
		System.out.println("Yes, the hospital is open");
	}

	static void areDoctorsAvailable() {
		System.out.println("Yes, doctors are available");
	}

	static void isEmergencyServiceAvailable() {
		System.out.println("Yes, emergency services are available");
	}

	static void isAmbulanceAvailable() {
		System.out.println("Yes, ambulance service is available");
	}

	static String getHospitalName() {
		return "City Hospital";
	}

	static int getNumberOfDoctors() {
		return 25;
	}

	static int getNumberOfBeds() {
		return 100;
	}

	static String getHospitalLocation() {
		return "Bengaluru";
	}
}