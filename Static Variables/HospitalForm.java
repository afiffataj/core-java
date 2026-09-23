class HospitalForm{
	static String hospitalName="City Care Hospital";
	static String hospitalLocation="Mysore";
	static int numberOfBeds=250;
	static boolean emergencyAvailable=true;
	static String emergencyTiming="24 Hours";

	public static void main(String[] args){
		System.out.println("HospitalForm are imp to maintane");

		String patientName;
		int patientAge;
		String disease;
		String doctorName;
		int roomNumber;

		System.out.println("1st Patient");
		patientName="Ramesh";
		patientAge=45;
		disease="Fever";
		doctorName="Dr. Kumar";
		roomNumber=101;

		System.out.println("hospitalName="+HospitalForm.hospitalName);
		System.out.println("hospitalLocation="+HospitalForm.hospitalLocation);
		System.out.println("numberOfBeds="+HospitalForm.numberOfBeds);
		System.out.println("emergencyAvailable="+HospitalForm.emergencyAvailable);
		System.out.println("emergencyTiming="+HospitalForm.emergencyTiming);
		System.out.println("patientName="+patientName);
		System.out.println("patientAge="+patientAge);
		System.out.println("disease="+disease);
		System.out.println("doctorName="+doctorName);
		System.out.println("roomNumber="+roomNumber);
		System.out.println();

		System.out.println("2nd Patient");
		patientName="Priya";
		patientAge=32;
		disease="Migraine";
		doctorName="Dr. Anitha";
		roomNumber=205;

		System.out.println("hospitalName="+HospitalForm.hospitalName);
		System.out.println("hospitalLocation="+HospitalForm.hospitalLocation);
		System.out.println("numberOfBeds="+HospitalForm.numberOfBeds);
		System.out.println("emergencyAvailable="+HospitalForm.emergencyAvailable);
		System.out.println("emergencyTiming="+HospitalForm.emergencyTiming);
		System.out.println("patientName="+patientName);
		System.out.println("patientAge="+patientAge);
		System.out.println("disease="+disease);
		System.out.println("doctorName="+doctorName);
		System.out.println("roomNumber="+roomNumber);
		System.out.println();

		System.out.println("3rd Patient");
		patientName="Suresh";
		patientAge=58;
		disease="Diabetes";
		doctorName="Dr. Ravi";
		roomNumber=310;

		System.out.println("hospitalName="+HospitalForm.hospitalName);
		System.out.println("hospitalLocation="+HospitalForm.hospitalLocation);
		System.out.println("numberOfBeds="+HospitalForm.numberOfBeds);
		System.out.println("emergencyAvailable="+HospitalForm.emergencyAvailable);
		System.out.println("emergencyTiming="+HospitalForm.emergencyTiming);
		System.out.println("patientName="+patientName);
		System.out.println("patientAge="+patientAge);
		System.out.println("disease="+disease);
		System.out.println("doctorName="+doctorName);
		System.out.println("roomNumber="+roomNumber);
	}
}
