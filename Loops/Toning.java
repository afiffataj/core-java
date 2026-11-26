class Toning{
	public static void main(String[] kjhltjrkesz){
		
    System.out.println("Are Items Available");

	boolean available1 = true;
    boolean available2 = true;
    boolean available3 = false;
    boolean available4 = true;
    boolean available5 = true;
    boolean available6 = false;
    boolean available7 = true;
    boolean available8 = true;
    boolean available9 = false;
    boolean available10 = true;
    boolean available11 = true;
    boolean available12 = false;
    boolean available13 = true;
    boolean available14 = true;
    boolean available15 = false;
    boolean available16 = true;
    boolean available17 = true;
    boolean available18 = false;
    boolean available19 = true;
    boolean available20 = true;
	
	boolean[] availables={available1,available12,available13,available15,available9,
	available10,available11,available20,available6,available7};
	Toning.addToCart(availables);
	}
	
	static void addToCart(boolean[] b){
		
		for(int i=0;i<=9;i++){
			System.out.println(b[i]);
		}
	}
}