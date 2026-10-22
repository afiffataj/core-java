class ElectricityBoard {
    public static void main(String[] args) {

        System.out.println("Electricity Board Details");

        float voltage = 220.5f;
        float voltage1 = 230.5f;

        ElectricityBoard.printVoltages(voltage, voltage1);
        ElectricityBoard.printConnectionStatus(true, false);
    }

    static void printVoltages(float a, float b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printConnectionStatus(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}