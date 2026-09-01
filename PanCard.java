class PanCard{
	public static void apply(String firstName,String lastName,
	String middleName,char gender,String dob,long mobileNumber,
	String address,String email){
		System.out.println("firstName="+firstName);
	    System.out.println("lastName="+lastName);
		System.out.println("middleName="+middleName);
		System.out.println("gender="+gender);
		System.out.println("dob="+dob);
		System.out.println("mobileNumber="+mobileNumber);
		System.out.println("address="+address);
		System.out.println("email="+email);
		if(firstName==null || lastName==null || middleName==null ||
		(gender=='M' || gender=='F' || gender=='O' || gender=='m' || 
		gender=='f' || gender=='o') || dob==null || mobileNumber<=9999999999L
		|| address==null || email==null)
		{
			System.out.println("invalid data");
		}
		else
		{
			System.out.println("valid data");
		}
	}
}