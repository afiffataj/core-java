class Switch {
    public static void main(String[] args) {
        System.out.println("Is the switch status available");

        boolean switchStatus = true;
        boolean switchStatus1 = false;

        Switch.isTheSwitchStatusAvailable(switchStatus, switchStatus1);
    }

    static void isTheSwitchStatusAvailable(boolean a, boolean b) {
        System.out.println(a);
        System.out.println(b);
    }
}