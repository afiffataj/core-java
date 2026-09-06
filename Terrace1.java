class Terrace1{

    static void openTerrace(){
        System.out.println("Terrace is open");
		openTerrace();
    }

    static void closeTerrace(){
        System.out.println("Terrace is closed");
    }

    public static void main(String[] args){

        openTerrace();
        closeTerrace();

	}
}
        