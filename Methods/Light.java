class Light {
    public static void main(String[] args) {

        System.out.println("Is the light status available");

        boolean lightStatus = true;
        boolean lightStatus1 = false;

        Light.isTheLightStatusAvailable(
            lightStatus, lightStatus1
        );
    }

    static void isTheLightStatusAvailable(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}