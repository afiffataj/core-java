class MedicalStore{
	public static void store(String medicalName,int price){
		System.out.println("Medicines are stored in MedicalStore");
	    if(medicalName==null)
		{
			System.out.println("medical name is invalid");
		}
		if(price>=0)
		{
			System.out.println("prize is valid");
		}
	}
}