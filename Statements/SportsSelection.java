class SportsSelection {
    public static void main(String[] args) {

        System.out.println("Sports Selection");

        String sports = "Cricket";

        switch (sports) {
            case "Cricket":
                System.out.println("Cricket is selected");
                break;

            case "Football":
                System.out.println("Football is selected");
                break;

            case "Hockey":
                System.out.println("Hockey is selected");
                break;

            case "Tennis":
                System.out.println("Tennis is selected");
                break;

            default:
                System.out.println("Sport is not available");
        }
    }
}