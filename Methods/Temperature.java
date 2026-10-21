class Temperature {
    public static void main(String[] args) {

        System.out.println("Is the temperature available");

        byte temperature = 25;
        byte temperature1 = 30;

        Temperature.isTheTemperatureAvailable(
            temperature, temperature1
        );
    }

    static void isTheTemperatureAvailable(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
    }
}