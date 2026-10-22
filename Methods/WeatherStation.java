class WeatherStation {
    public static void main(String[] args) {

        System.out.println("Weather Details");

        float temperature = 28.5f;
        float temperature1 = 32.7f;

        WeatherStation.printTemperatures(temperature, temperature1);
        WeatherStation.printWeatherStatus(true, false);
    }

    static void printTemperatures(float a, float b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void printWeatherStatus(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}