class Satellite{
	static String name;
	static int cost;
	static short cameras;
	static long satelliteCode;
	static char type;
	static float weight;
	static boolean isActive;
	static double orbitHeight;

	public static void main(String[] args){
		System.out.println("Satellite is used for communication and research");

		int launchYear=2026;
		String purpose="Communication";
		byte quantity=4;
		char status='A';

		System.out.println("name="+Satellite.name);
		System.out.println("cost="+Satellite.cost);
		System.out.println("cameras="+Satellite.cameras);
		System.out.println("satelliteCode="+Satellite.satelliteCode);
		System.out.println("type="+Satellite.type);
		System.out.println("weight="+Satellite.weight);
		System.out.println("isActive="+Satellite.isActive);
		System.out.println("orbitHeight="+Satellite.orbitHeight);
		System.out.println(launchYear);
		System.out.println(purpose);
		System.out.println(quantity);
		System.out.println(status);
	}
}