class DistrictFinderRunner{
	public static void main(String[] args){
		String stateName="Bihar";
		String[] totalDistrictFinder=DistrictFinder.findDistrictsByStateName(stateName);
		System.out.println("totalDistrictFinder="+totalDistrictFinder.length);
		
	}
}