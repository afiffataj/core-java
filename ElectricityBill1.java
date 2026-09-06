class ElectricityBill1{

    public static void calculateBill(String companyName, String customerName, int units){

        int totalBill;

        if(units <= 100){
            totalBill = units * 5;
        }
        else if(units <= 200){
            totalBill = units * 7;
        }
        else{
            totalBill = units * 10;
        }

        System.out.println("companyName=" + companyName);
        System.out.println("customerName=" + customerName);
        System.out.println("unitsConsumed=" + units);
        System.out.println("totalBill=" + totalBill);
    }

    public static void main(String[] args){

        calculateBill("BESCOM", "Afiiii", 150);

    }
}